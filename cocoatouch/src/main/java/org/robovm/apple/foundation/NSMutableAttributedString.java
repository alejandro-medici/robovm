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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMutableAttributedString/*</name>*/ 
    extends /*<extends>*/NSAttributedString/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSMutableAttributedStringPtr extends Ptr<NSMutableAttributedString, NSMutableAttributedStringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSMutableAttributedString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSMutableAttributedString() {}
    protected NSMutableAttributedString(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    
    public NSMutableAttributedString(NSAttributedString attrStr) {
        super(attrStr);
    }
    public NSMutableAttributedString(String str, NSDictionary<NSString, ?> attrs) {
        super(str, attrs);
    }
    public NSMutableAttributedString(String str) {
        super(str);
    }    
    
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "replaceCharactersInRange:withString:")
    public native void replace(@ByVal NSRange range, String str);
    @Method(selector = "setAttributes:range:")
    public native void setAttributes(NSDictionary<NSString, ?> attrs, @ByVal NSRange range);
    @Method(selector = "mutableString")
    public native NSMutableString getMutableString();
    @Method(selector = "addAttribute:value:range:")
    public native void addAttribute(NSString name, NSObject value, @ByVal NSRange range);
    @Method(selector = "addAttributes:range:")
    public native void addAttributes(NSDictionary<NSString, ?> attrs, @ByVal NSRange range);
    @Method(selector = "removeAttribute:range:")
    public native void removeAttribute(NSString name, @ByVal NSRange range);
    @Method(selector = "replaceCharactersInRange:withAttributedString:")
    public native void replace(@ByVal NSRange range, NSAttributedString attrString);
    @Method(selector = "insertAttributedString:atIndex:")
    public native void insert(NSAttributedString attrString, @MachineSizedUInt long loc);
    @Method(selector = "appendAttributedString:")
    public native void append(NSAttributedString attrString);
    @Method(selector = "deleteCharactersInRange:")
    public native void delete(@ByVal NSRange range);
    @Method(selector = "setAttributedString:")
    public native void setAttributedString(NSAttributedString attrString);
    @Method(selector = "beginEditing")
    public native void beginEditing();
    @Method(selector = "endEditing")
    public native void endEditing();
    /*</methods>*/
}
