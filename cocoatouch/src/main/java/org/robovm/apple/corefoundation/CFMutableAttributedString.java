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
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("CoreFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFMutableAttributedString/*</name>*/ 
    extends /*<extends>*/CFAttributedString/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFMutableAttributedStringPtr extends Ptr<CFMutableAttributedString, CFMutableAttributedStringPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFMutableAttributedString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFMutableAttributedString() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFAttributedStringCreateMutableCopy", optional=true)
    public static native CFMutableAttributedString createMutableCopy(CFAllocator alloc, @MachineSizedSInt long maxLength, CFAttributedString aStr);
    @Bridge(symbol="CFAttributedStringCreateMutable", optional=true)
    public static native CFMutableAttributedString createMutable(CFAllocator alloc, @MachineSizedSInt long maxLength);
    @Bridge(symbol="CFAttributedStringReplaceString", optional=true)
    public native void replaceString(@ByVal CFRange range, CFString replacement);
    @Bridge(symbol="CFAttributedStringGetMutableString", optional=true)
    public native CFMutableString getMutableString();
    @Bridge(symbol="CFAttributedStringSetAttributes", optional=true)
    public native void setAttributes(@ByVal CFRange range, CFDictionary replacement, boolean clearOtherAttributes);
    @Bridge(symbol="CFAttributedStringSetAttribute", optional=true)
    public native void setAttribute(@ByVal CFRange range, CFString attrName, CFType value);
    @Bridge(symbol="CFAttributedStringRemoveAttribute", optional=true)
    public native void removeAttribute(@ByVal CFRange range, CFString attrName);
    @Bridge(symbol="CFAttributedStringReplaceAttributedString", optional=true)
    public native void replaceAttributedString(@ByVal CFRange range, CFAttributedString replacement);
    @Bridge(symbol="CFAttributedStringBeginEditing", optional=true)
    public native void beginEditing();
    @Bridge(symbol="CFAttributedStringEndEditing", optional=true)
    public native void endEditing();
    /*</methods>*/
}
