/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.streaming.udfs;

import java.util.Map;

/**
 * 移除字符串前后特殊字符
 * 
 */
@UDFAnnotation("trim")
public class StringTrim extends UDF
{
    
    /**
     * 注释内容
     */
    private static final long serialVersionUID = 4793756788804334850L;
    
    /**
     * <默认构造函数>
     */
    public StringTrim(Map<String, String> config)
    {
        super(config);
    }
    
    /**
     * trim
     */
    public String evaluate(String s)
    {
        if (s == null)
        {
            return "";
        }
        
        return s.trim();
    }
    
}
