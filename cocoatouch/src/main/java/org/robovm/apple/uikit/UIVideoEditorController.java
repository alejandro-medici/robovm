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
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIVideoEditorController/*</name>*/ 
    extends /*<extends>*/UINavigationController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIVideoEditorControllerPtr extends Ptr<UIVideoEditorController, UIVideoEditorControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIVideoEditorController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIVideoEditorController() {}
    protected UIVideoEditorController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UIVideoEditorControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIVideoEditorControllerDelegate v);
    @Property(selector = "videoPath")
    public native String getVideoPath();
    @Property(selector = "setVideoPath:")
    public native void setVideoPath(String v);
    @Property(selector = "videoMaximumDuration")
    public native double getVideoMaximumDuration();
    @Property(selector = "setVideoMaximumDuration:")
    public native void setVideoMaximumDuration(double v);
    @Property(selector = "videoQuality")
    public native UIImagePickerControllerQualityType getVideoQuality();
    @Property(selector = "setVideoQuality:")
    public native void setVideoQuality(UIImagePickerControllerQualityType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public static boolean canEditVideo(File file) {
        return canEditVideoAtPath$(file.getAbsolutePath());
    }
    
    /*<methods>*/
    @Method(selector = "canEditVideoAtPath:")
    protected static native boolean canEditVideoAtPath$(String videoPath);
    /*</methods>*/
}
