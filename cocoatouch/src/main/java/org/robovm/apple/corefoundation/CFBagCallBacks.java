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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFBagCallBacks/*</name>*/ 
    extends /*<extends>*/Struct<CFBagCallBacks>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFBagCallBacksPtr extends Ptr<CFBagCallBacks, CFBagCallBacksPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CFBagCallBacks() {}
    public CFBagCallBacks(@MachineSizedSInt long version, FunctionPtr retain, FunctionPtr release, FunctionPtr copyDescription, FunctionPtr equal, FunctionPtr hash) {
        this.version(version);
        this.retain(retain);
        this.release(release);
        this.copyDescription(copyDescription);
        this.equal(equal);
        this.hash(hash);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedSInt long version();
    @StructMember(0) public native CFBagCallBacks version(@MachineSizedSInt long version);
    @StructMember(1) public native FunctionPtr retain();
    @StructMember(1) public native CFBagCallBacks retain(FunctionPtr retain);
    @StructMember(2) public native FunctionPtr release();
    @StructMember(2) public native CFBagCallBacks release(FunctionPtr release);
    @StructMember(3) public native FunctionPtr copyDescription();
    @StructMember(3) public native CFBagCallBacks copyDescription(FunctionPtr copyDescription);
    @StructMember(4) public native FunctionPtr equal();
    @StructMember(4) public native CFBagCallBacks equal(FunctionPtr equal);
    @StructMember(5) public native FunctionPtr hash();
    @StructMember(5) public native CFBagCallBacks hash(FunctionPtr hash);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
