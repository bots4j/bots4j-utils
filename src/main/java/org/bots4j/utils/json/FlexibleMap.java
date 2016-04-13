package org.bots4j.utils.json;

/*
 * Copyright (C) 2016 Adam J Chesney
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.LinkedHashMap;

/**
 * Created by ajchesney on 13/04/2016.
 */
public class FlexibleMap extends LinkedHashMap<String,Object> {

    /**
     * Get the value from the map but use Gson to convert it to
     * the required type
     * @param key
     * @param requiredType
     * @param <E>
     * @return
     */
    public <E> E getAs(String key, Class<E> requiredType){
        return GsonUtils.convertIfRequired(get(key),requiredType);
    }

}