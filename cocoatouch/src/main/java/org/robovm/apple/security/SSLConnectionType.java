/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
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
 */
package org.robovm.apple.security;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/**
 * <div class="javadoc"></div>
 */
/*<annotations>*/
/*</annotations>*/
public enum /*<name>*/SSLConnectionType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    StreamType(0L),
    DatagramType(1L);
    /*</values>*/

    private final long n;

    private /*<name>*/SSLConnectionType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/SSLConnectionType/*</name>*/ valueOf(long n) {
        for (/*<name>*/SSLConnectionType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/SSLConnectionType/*</name>*/.class.getName());
    }
}
