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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSLock/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSLocking/*</implements>*/ {

    /*<ptr>*/public static class NSLockPtr extends Ptr<NSLock, NSLockPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSLock.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSLock() {}
    protected NSLock(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "tryLock")
    public native boolean tryLock();
    @Method(selector = "lockBeforeDate:")
    public native boolean lockBeforeDate$(NSDate limit);
    @Method(selector = "setName:")
    public native void setName(String n);
    @Method(selector = "name")
    public native String name();
    @Method(selector = "lock")
    public native void lock();
    @Method(selector = "unlock")
    public native void unlock();
    /*</methods>*/
}
