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
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextInputTokenizerAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITextInputTokenizer/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("rangeEnclosingPosition:withGranularity:inDirection:")
    public UITextRange getRangeEnclosingPosition(UITextPosition position, UITextGranularity granularity, @MachineSizedSInt long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("isPosition:atBoundary:inDirection:")
    public boolean isPositionAtBoundary(UITextPosition position, UITextGranularity granularity, @MachineSizedSInt long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("positionFromPosition:toBoundary:inDirection:")
    public UITextPosition getPosition(UITextPosition position, UITextGranularity granularity, @MachineSizedSInt long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("isPosition:withinTextUnit:inDirection:")
    public boolean isPositionWithinTextUnit(UITextPosition position, UITextGranularity granularity, @MachineSizedSInt long direction) { throw new UnsupportedOperationException(); }
    /*</methods>*/
}
