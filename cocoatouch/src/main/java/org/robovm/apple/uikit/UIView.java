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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIView/*</name>*/ 
    extends /*<extends>*/UIResponder/*</extends>*/ 
    /*<implements>*/implements NSCoding, UIAppearanceContainer, UIDynamicItem, UIAccessibilityIdentification/*</implements>*/ {

    /*<ptr>*/public static class UIViewPtr extends Ptr<UIView, UIViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIView() {}
    protected UIView(SkipInit skipInit) { super(skipInit); }
    public UIView(@ByVal CGRect frame) { super((SkipInit) null); initObject(initWithFrame$(frame)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Property(selector = "setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @Property(selector = "tag")
    public native @MachineSizedSInt long getTag();
    @Property(selector = "setTag:")
    public native void setTag(@MachineSizedSInt long v);
    @Property(selector = "layer")
    public native CALayer getLayer();
    @Property(selector = "frame")
    public native @ByVal CGRect getFrame();
    @Property(selector = "setFrame:")
    public native void setFrame(@ByVal CGRect v);
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    @Property(selector = "setBounds:")
    public native void setBounds(@ByVal CGRect v);
    @Property(selector = "center")
    public native @ByVal CGPoint getCenter();
    @Property(selector = "setCenter:")
    public native void setCenter(@ByVal CGPoint v);
    @Property(selector = "transform")
    public native @ByVal CGAffineTransform getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(@ByVal CGAffineTransform v);
    @Property(selector = "contentScaleFactor")
    public native @MachineSizedFloat double getContentScaleFactor();
    @Property(selector = "setContentScaleFactor:")
    public native void setContentScaleFactor(@MachineSizedFloat double v);
    @Property(selector = "isMultipleTouchEnabled")
    public native boolean isMultipleTouchEnabled();
    @Property(selector = "setMultipleTouchEnabled:")
    public native void setMultipleTouchEnabled(boolean v);
    @Property(selector = "isExclusiveTouch")
    public native boolean isExclusiveTouch();
    @Property(selector = "setExclusiveTouch:")
    public native void setExclusiveTouch(boolean v);
    @Property(selector = "autoresizesSubviews")
    public native boolean isAutoresizesSubviews();
    @Property(selector = "setAutoresizesSubviews:")
    public native void setAutoresizesSubviews(boolean v);
    @Property(selector = "autoresizingMask")
    public native UIViewAutoresizing getAutoresizingMask();
    @Property(selector = "setAutoresizingMask:")
    public native void setAutoresizingMask(UIViewAutoresizing v);
    @Property(selector = "superview")
    public native UIView getSuperview();
    @Property(selector = "subviews")
    public native NSArray<UIView> getSubviews();
    @Property(selector = "window")
    public native UIWindow getWindow();
    @Property(selector = "clipsToBounds")
    public native boolean isClipsToBounds();
    @Property(selector = "setClipsToBounds:")
    public native void setClipsToBounds(boolean v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "alpha")
    public native @MachineSizedFloat double getAlpha();
    @Property(selector = "setAlpha:")
    public native void setAlpha(@MachineSizedFloat double v);
    @Property(selector = "isOpaque")
    public native boolean isOpaque();
    @Property(selector = "setOpaque:")
    public native void setOpaque(boolean v);
    @Property(selector = "clearsContextBeforeDrawing")
    public native boolean isClearsContextBeforeDrawing();
    @Property(selector = "setClearsContextBeforeDrawing:")
    public native void setClearsContextBeforeDrawing(boolean v);
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @Property(selector = "contentMode")
    public native UIViewContentMode getContentMode();
    @Property(selector = "setContentMode:")
    public native void setContentMode(UIViewContentMode v);
    @Property(selector = "contentStretch")
    public native @ByVal CGRect getContentStretch();
    @Property(selector = "setContentStretch:")
    public native void setContentStretch(@ByVal CGRect v);
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @Property(selector = "tintAdjustmentMode")
    public native UIViewTintAdjustmentMode getTintAdjustmentMode();
    @Property(selector = "setTintAdjustmentMode:")
    public native void setTintAdjustmentMode(UIViewTintAdjustmentMode v);
    @Property(selector = "gestureRecognizers")
    public native NSArray<UIGestureRecognizer> getGestureRecognizers();
    @Property(selector = "setGestureRecognizers:")
    public native void setGestureRecognizers(NSArray<UIGestureRecognizer> v);
    @Property(selector = "motionEffects")
    public native NSArray<UIMotionEffect> getMotionEffects();
    @Property(selector = "setMotionEffects:")
    public native void setMotionEffects(NSArray<UIMotionEffect> v);
    @Property(selector = "restorationIdentifier")
    public native String getRestorationIdentifier();
    @Property(selector = "setRestorationIdentifier:")
    public native void setRestorationIdentifier(String v);
    @Property(selector = "accessibilityIdentifier")
    public native String getAccessibilityIdentifier();
    @Property(selector = "setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UIViewNoIntrinsicMetric", optional=true)
    public static native @MachineSizedFloat double NoIntrinsicMetric();
    @GlobalValue(symbol="UILayoutFittingCompressedSize", optional=true)
    public static native @ByVal CGSize LayoutFittingCompressedSize();
    @GlobalValue(symbol="UILayoutFittingExpandedSize", optional=true)
    public static native @ByVal CGSize LayoutFittingExpandedSize();
    
    @Method(selector = "initWithFrame:")
    protected native @Pointer long initWithFrame$(@ByVal CGRect frame);
    @Method(selector = "layerClass")
    public static native ObjCClass getLayerClass();
    @Method(selector = "hitTest:withEvent:")
    public native UIView hitTest(@ByVal CGPoint point, UIEvent event);
    @Method(selector = "pointInside:withEvent:")
    public native boolean isPointInside(@ByVal CGPoint point, UIEvent event);
    @Method(selector = "convertPoint:toView:")
    public native @ByVal CGPoint convertPointToView(@ByVal CGPoint point, UIView view);
    @Method(selector = "convertPoint:fromView:")
    public native @ByVal CGPoint convertPointFromView(@ByVal CGPoint point, UIView view);
    @Method(selector = "convertRect:toView:")
    public native @ByVal CGRect convertRectToView(@ByVal CGRect rect, UIView view);
    @Method(selector = "convertRect:fromView:")
    public native @ByVal CGRect convertRectFromView(@ByVal CGRect rect, UIView view);
    @Method(selector = "sizeThatFits:")
    public native @ByVal CGSize getSizeThatFits(@ByVal CGSize size);
    @Method(selector = "sizeToFit")
    public native void resizeToFit();
    @Method(selector = "removeFromSuperview")
    public native void removeFromSuperview();
    @Method(selector = "insertSubview:atIndex:")
    public native void insertSubview(UIView view, @MachineSizedSInt long index);
    @Method(selector = "exchangeSubviewAtIndex:withSubviewAtIndex:")
    public native void exchangeSubview(@MachineSizedSInt long index1, @MachineSizedSInt long index2);
    @Method(selector = "addSubview:")
    public native void addSubview(UIView view);
    @Method(selector = "insertSubview:belowSubview:")
    public native void insertSubviewBelow(UIView view, UIView siblingSubview);
    @Method(selector = "insertSubview:aboveSubview:")
    public native void insertSubviewAbove(UIView view, UIView siblingSubview);
    @Method(selector = "bringSubviewToFront:")
    public native void bringSubviewToFront(UIView view);
    @Method(selector = "sendSubviewToBack:")
    public native void sendSubviewToBack(UIView view);
    @Method(selector = "didAddSubview:")
    public native void didAddSubview(UIView subview);
    @Method(selector = "willRemoveSubview:")
    public native void willRemoveSubview(UIView subview);
    @Method(selector = "willMoveToSuperview:")
    public native void willMoveToSuperview(UIView newSuperview);
    @Method(selector = "didMoveToSuperview")
    public native void didMoveToSuperview();
    @Method(selector = "willMoveToWindow:")
    public native void willMoveToWindow(UIWindow newWindow);
    @Method(selector = "didMoveToWindow")
    public native void didMoveToWindow();
    @Method(selector = "isDescendantOfView:")
    public native boolean isDescendantOf(UIView view);
    @Method(selector = "viewWithTag:")
    public native UIView getViewWithTag(@MachineSizedSInt long tag);
    @Method(selector = "setNeedsLayout")
    public native void setNeedsLayout();
    @Method(selector = "layoutIfNeeded")
    public native void layoutIfNeeded();
    @Method(selector = "layoutSubviews")
    public native void layoutSubviews();
    @Method(selector = "drawRect:")
    public native void draw(@ByVal CGRect rect);
    @Method(selector = "setNeedsDisplay")
    public native void setNeedsDisplay();
    @Method(selector = "setNeedsDisplayInRect:")
    public native void setNeedsDisplay(@ByVal CGRect rect);
    @Method(selector = "tintColorDidChange")
    public native void tintColorDidChange();
    @Method(selector = "beginAnimations:context:")
    public static native void beginAnimations(String animationID, VoidPtr context);
    @Method(selector = "commitAnimations")
    public static native void commitAnimations();
    @Method(selector = "setAnimationDelegate:")
    public static native void setAnimationDelegate(NSObject delegate);
    @Method(selector = "setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(Selector selector);
    @Method(selector = "setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(Selector selector);
    @Method(selector = "setAnimationDuration:")
    public static native void setDurationForAnimation(double duration);
    @Method(selector = "setAnimationDelay:")
    public static native void setAnimationDelay(double delay);
    @Method(selector = "setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);
    @Method(selector = "setAnimationCurve:")
    public static native void setAnimationCurve(UIViewAnimationCurve curve);
    @Method(selector = "setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount(float repeatCount);
    @Method(selector = "setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);
    @Method(selector = "setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);
    @Method(selector = "setAnimationTransition:forView:cache:")
    public static native void setAnimationTransition(UIViewAnimationTransition transition, UIView view, boolean cache);
    @Method(selector = "setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);
    @Method(selector = "areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();
    @Method(selector = "performWithoutAnimation:")
    public static native void performWithoutAnimation(@Block Runnable actionsWithoutAnimation);
    @Method(selector = "animateWithDuration:delay:options:animations:completion:")
    public static native void animate(double duration, double delay, UIViewAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "animateWithDuration:animations:completion:")
    public static native void animate(double duration, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "animateWithDuration:animations:")
    public static native void animate(double duration, @Block Runnable animations);
    @Method(selector = "animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDuration(double duration, double delay, @MachineSizedFloat double dampingRatio, @MachineSizedFloat double velocity, UIViewAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "transitionWithView:duration:options:animations:completion:")
    public static native void transition(UIView view, double duration, UIViewAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "transitionFromView:toView:duration:options:completion:")
    public static native void transition(UIView fromView, UIView toView, double duration, UIViewAnimationOptions options, @Block VoidBooleanBlock completion);
    @Method(selector = "performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimation(UISystemAnimation animation, NSArray<UIView> views, UIViewAnimationOptions options, @Block Runnable parallelAnimations, @Block VoidBooleanBlock completion);
    @Method(selector = "animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframes(double duration, double delay, UIViewKeyframeAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframe(double frameStartTime, double frameDuration, @Block Runnable animations);
    @Method(selector = "addGestureRecognizer:")
    public native void addGestureRecognizer(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "removeGestureRecognizer:")
    public native void removeGestureRecognizer(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "addMotionEffect:")
    public native void addMotionEffect(UIMotionEffect effect);
    @Method(selector = "removeMotionEffect:")
    public native void removeMotionEffect(UIMotionEffect effect);
    @Method(selector = "constraints")
    public native NSArray<NSLayoutConstraint> getConstraints();
    @Method(selector = "addConstraint:")
    public native void addConstraint(NSLayoutConstraint constraint);
    @Method(selector = "addConstraints:")
    public native void addConstraints(NSArray<NSLayoutConstraint> constraints);
    @Method(selector = "removeConstraint:")
    public native void removeConstraint(NSLayoutConstraint constraint);
    @Method(selector = "removeConstraints:")
    public native void removeConstraints(NSArray<NSLayoutConstraint> constraints);
    @Method(selector = "updateConstraintsIfNeeded")
    public native void updateConstraintsIfNeeded();
    @Method(selector = "updateConstraints")
    public native void updateConstraints();
    @Method(selector = "needsUpdateConstraints")
    public native boolean needsUpdateConstraints();
    @Method(selector = "setNeedsUpdateConstraints")
    public native void setNeedsUpdateConstraints();
    @Method(selector = "translatesAutoresizingMaskIntoConstraints")
    public native boolean translatesAutoresizingMaskIntoConstraints();
    @Method(selector = "setTranslatesAutoresizingMaskIntoConstraints:")
    public native void setTranslatesAutoresizingMaskIntoConstraints(boolean flag);
    @Method(selector = "requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();
    @Method(selector = "alignmentRectForFrame:")
    public native @ByVal CGRect getAlignmentRectForFrame(@ByVal CGRect frame);
    @Method(selector = "frameForAlignmentRect:")
    public native @ByVal CGRect getFrameForAlignmentRect(@ByVal CGRect alignmentRect);
    @Method(selector = "alignmentRectInsets")
    public native @ByVal UIEdgeInsets getAlignmentRectInsets();
    @Method(selector = "viewForBaselineLayout")
    public native UIView getViewForBaselineLayout();
    @Method(selector = "intrinsicContentSize")
    public native @ByVal CGSize getIntrinsicContentSize();
    @Method(selector = "invalidateIntrinsicContentSize")
    public native void invalidateIntrinsicContentSize();
    @Method(selector = "contentHuggingPriorityForAxis:")
    public native float getContentHuggingPriority(UILayoutConstraintAxis axis);
    @Method(selector = "setContentHuggingPriority:forAxis:")
    public native void setContentHuggingPriority(float priority, UILayoutConstraintAxis axis);
    @Method(selector = "contentCompressionResistancePriorityForAxis:")
    public native float getContentCompressionResistancePriority(UILayoutConstraintAxis axis);
    @Method(selector = "setContentCompressionResistancePriority:forAxis:")
    public native void setContentCompressionResistancePriority(float priority, UILayoutConstraintAxis axis);
    @Method(selector = "systemLayoutSizeFittingSize:")
    public native @ByVal CGSize getSystemLayoutSizeFittingSize(@ByVal CGSize targetSize);
    @Method(selector = "constraintsAffectingLayoutForAxis:")
    public native NSArray<NSLayoutConstraint> getConstraintsAffectingLayout(UILayoutConstraintAxis axis);
    @Method(selector = "hasAmbiguousLayout")
    public native boolean hasAmbiguousLayout();
    @Method(selector = "exerciseAmbiguityInLayout")
    public native void exerciseAmbiguityInLayout();
    @Method(selector = "encodeRestorableStateWithCoder:")
    public native void encodeRestorableState(NSCoder coder);
    @Method(selector = "decodeRestorableStateWithCoder:")
    public native void decodeRestorableState(NSCoder coder);
    @Method(selector = "snapshotViewAfterScreenUpdates:")
    public native UIView snapshotView(boolean afterUpdates);
    @Method(selector = "resizableSnapshotViewFromRect:afterScreenUpdates:withCapInsets:")
    public native UIView resizableSnapshotView(@ByVal CGRect rect, boolean afterUpdates, @ByVal UIEdgeInsets capInsets);
    @Method(selector = "drawViewHierarchyInRect:afterScreenUpdates:")
    public native boolean drawViewHierarchy(@ByVal CGRect rect, boolean afterUpdates);
    @Method(selector = "endEditing:")
    public native boolean endEditing(boolean force);
    @Method(selector = "viewPrintFormatter")
    public native UIViewPrintFormatter getViewPrintFormatter();
    @Method(selector = "drawRect:forViewPrintFormatter:")
    public native void draw(@ByVal CGRect rect, UIViewPrintFormatter formatter);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    /*</methods>*/
}
