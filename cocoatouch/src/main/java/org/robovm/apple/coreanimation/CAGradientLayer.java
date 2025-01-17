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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.opengles.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAGradientLayer/*</name>*/ 
    extends /*<extends>*/CALayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAGradientLayerPtr extends Ptr<CAGradientLayer, CAGradientLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAGradientLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAGradientLayer() {}
    protected CAGradientLayer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "colors")
    public native NSArray<?> getColors();
    @Property(selector = "setColors:")
    public native void setColors(NSArray<?> v);
    @Property(selector = "locations")
    public native NSArray<?> getLocations();
    @Property(selector = "setLocations:")
    public native void setLocations(NSArray<?> v);
    @Property(selector = "startPoint")
    public native @ByVal CGPoint getStartPoint();
    @Property(selector = "setStartPoint:")
    public native void setStartPoint(@ByVal CGPoint v);
    @Property(selector = "endPoint")
    public native @ByVal CGPoint getEndPoint();
    @Property(selector = "setEndPoint:")
    public native void setEndPoint(@ByVal CGPoint v);
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kCAGradientLayerAxial", optional=true)
    public static native String TypeAxial();
    
    
    /*</methods>*/
}
