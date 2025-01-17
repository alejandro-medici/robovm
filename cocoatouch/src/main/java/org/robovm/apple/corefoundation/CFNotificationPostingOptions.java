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
package org.robovm.apple.corefoundation;

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
/*</imports>*/

/**
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CFNotificationPostingOptions/*</name>*/ extends Bits</*<name>*/CFNotificationPostingOptions/*</name>*/> {
    /*<values>*/
    public static final CFNotificationPostingOptions DeliverImmediately = new CFNotificationPostingOptions(1L);
    public static final CFNotificationPostingOptions PostToAllSessions = new CFNotificationPostingOptions(2L);
    /*</values>*/

    private static final /*<name>*/CFNotificationPostingOptions/*</name>*/[] values = _values(/*<name>*/CFNotificationPostingOptions/*</name>*/.class);

    public /*<name>*/CFNotificationPostingOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/CFNotificationPostingOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CFNotificationPostingOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CFNotificationPostingOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/CFNotificationPostingOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CFNotificationPostingOptions/*</name>*/[] values() {
        return values.clone();
    }
}
