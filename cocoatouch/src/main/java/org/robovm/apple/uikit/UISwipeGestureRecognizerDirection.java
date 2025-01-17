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
package org.robovm.apple.uikit;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/**
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/UISwipeGestureRecognizerDirection/*</name>*/ extends Bits</*<name>*/UISwipeGestureRecognizerDirection/*</name>*/> {
    /*<values>*/
    public static final UISwipeGestureRecognizerDirection Right = new UISwipeGestureRecognizerDirection(1L);
    public static final UISwipeGestureRecognizerDirection Left = new UISwipeGestureRecognizerDirection(2L);
    public static final UISwipeGestureRecognizerDirection Up = new UISwipeGestureRecognizerDirection(4L);
    public static final UISwipeGestureRecognizerDirection Down = new UISwipeGestureRecognizerDirection(8L);
    /*</values>*/

    private static final /*<name>*/UISwipeGestureRecognizerDirection/*</name>*/[] values = _values(/*<name>*/UISwipeGestureRecognizerDirection/*</name>*/.class);

    public /*<name>*/UISwipeGestureRecognizerDirection/*</name>*/(long value) { super(value); }
    private /*<name>*/UISwipeGestureRecognizerDirection/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UISwipeGestureRecognizerDirection/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UISwipeGestureRecognizerDirection/*</name>*/(value, mask);
    }
    protected /*<name>*/UISwipeGestureRecognizerDirection/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UISwipeGestureRecognizerDirection/*</name>*/[] values() {
        return values.clone();
    }
}
