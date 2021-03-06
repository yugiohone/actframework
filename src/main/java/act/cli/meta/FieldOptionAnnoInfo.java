package act.cli.meta;

/*-
 * #%L
 * ACT Framework
 * %%
 * Copyright (C) 2014 - 2017 ActFramework
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import act.app.App;
import act.asm.Type;
import org.osgl.$;

/**
 * Store {@link OptionAnnoInfoBase option annotation info} that
 * come from a {@link java.lang.reflect.Field field}
 */
public class FieldOptionAnnoInfo extends OptionAnnoInfoBase {
    private String fieldName;
    private Type type;
    private boolean readFileContent;

    public FieldOptionAnnoInfo(String fieldName, Type type, boolean optional) {
        super(optional);
        this.fieldName = fieldName;
        this.type = type;
    }

    public String fieldName() {
        return fieldName;
    }

    public Class fieldType() {
        return $.classForName(type.getClassName(), App.instance().classLoader());
    }

    public void setReadFileContent() {
        readFileContent = true;
    }

    public boolean readFileContent() {
        return readFileContent;
    }

}
