/*************************************************************************
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.  The
 * ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 * 
 *************************************************************************/

package org.deltacloud.client.unmarshal;

import org.deltacloud.client.Realm;
import org.w3c.dom.Element;

/**
 * @author André Dietisheim
 */
public class RealmUnmarshaller extends AbstractDOMUnmarshaller<Realm> {

    public RealmUnmarshaller() {
        super( "realm", Realm.class );
    }

    protected Realm doUnmarshall(Element element, Realm realm) throws Exception {
        realm.setId( getAttributeText( "id", element ) );
        realm.setName( getFirstElementText( "name", element ) );
        realm.setLimit( getFirstElementText( "limit", element ) );
        realm.setState( getFirstElementText( "state", element ) );
        return realm;
    }
}
