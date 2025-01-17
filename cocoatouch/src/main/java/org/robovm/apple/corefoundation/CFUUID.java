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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFUUID/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFUUIDPtr extends Ptr<CFUUID, CFUUIDPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFUUID.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFUUID() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFUUIDGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CFUUIDCreate", optional=true)
    public static native CFUUID create(CFAllocator alloc);
    @Bridge(symbol="CFUUIDCreateWithBytes", optional=true)
    public static native CFUUID createWithBytes(CFAllocator alloc, byte byte0, byte byte1, byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10, byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);
    @Bridge(symbol="CFUUIDCreateFromString", optional=true)
    public static native CFUUID createFromString(CFAllocator alloc, CFString uuidStr);
    @Bridge(symbol="CFUUIDCreateString", optional=true)
    public static native CFString createString(CFAllocator alloc, CFUUID uuid);
    @Bridge(symbol="CFUUIDGetConstantUUIDWithBytes", optional=true)
    public static native CFUUID getConstantUUIDWithBytes(CFAllocator alloc, byte byte0, byte byte1, byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10, byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);
    @Bridge(symbol="CFUUIDGetUUIDBytes", optional=true)
    public native @ByVal CFUUIDBytes getUUIDBytes();
    @Bridge(symbol="CFUUIDCreateFromUUIDBytes", optional=true)
    public static native CFUUID createFromUUIDBytes(CFAllocator alloc, @ByVal CFUUIDBytes bytes);
    /*</methods>*/
}
