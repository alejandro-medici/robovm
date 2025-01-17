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
package org.robovm.apple.security;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("Security")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecTrust/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SecTrustPtr extends Ptr<SecTrust, SecTrustPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(SecTrust.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SecTrust() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kSecTrustEvaluationDate", optional=true)
    public static native CFType EvaluationDate();
    @GlobalValue(symbol="kSecTrustExtendedValidation", optional=true)
    public static native CFType ExtendedValidation();
    @GlobalValue(symbol="kSecTrustOrganizationName", optional=true)
    public static native CFType OrganizationName();
    @GlobalValue(symbol="kSecTrustResultValue", optional=true)
    public static native CFType ResultValue();
    @GlobalValue(symbol="kSecTrustRevocationChecked", optional=true)
    public static native CFType RevocationChecked();
    @GlobalValue(symbol="kSecTrustRevocationValidUntilDate", optional=true)
    public static native CFType RevocationValidUntilDate();
    
    @Bridge(symbol="SecTrustGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="SecTrustCreateWithCertificates", optional=true)
    public static native int createWithCertificates(CFType certificates, CFType policies, SecTrust.SecTrustPtr trust);
    @Bridge(symbol="SecTrustSetPolicies", optional=true)
    public native int setPolicies(CFType policies);
    @Bridge(symbol="SecTrustCopyPolicies", optional=true)
    public native int copyPolicies(CFArray.CFArrayPtr policies);
    @Bridge(symbol="SecTrustSetNetworkFetchAllowed", optional=true)
    public native int setNetworkFetchAllowed(boolean allowFetch);
    @Bridge(symbol="SecTrustGetNetworkFetchAllowed", optional=true)
    public native int getNetworkFetchAllowed(BytePtr allowFetch);
    @Bridge(symbol="SecTrustSetAnchorCertificates", optional=true)
    public native int setAnchorCertificates(CFArray anchorCertificates);
    @Bridge(symbol="SecTrustSetAnchorCertificatesOnly", optional=true)
    public native int setAnchorCertificatesOnly(boolean anchorCertificatesOnly);
    @Bridge(symbol="SecTrustCopyCustomAnchorCertificates", optional=true)
    public native int copyCustomAnchorCertificates(CFArray.CFArrayPtr anchors);
    @Bridge(symbol="SecTrustSetVerifyDate", optional=true)
    public native int setVerifyDate(CFDate verifyDate);
    @Bridge(symbol="SecTrustGetVerifyTime", optional=true)
    public native double getVerifyTime();
    @Bridge(symbol="SecTrustEvaluate", optional=true)
    public native int evaluate(IntPtr result);
    @Bridge(symbol="SecTrustEvaluateAsync", optional=true)
    public native int evaluateAsync(DispatchQueue queue, FunctionPtr result);
    @Bridge(symbol="SecTrustGetTrustResult", optional=true)
    public native int getTrustResult(IntPtr result);
    @Bridge(symbol="SecTrustCopyPublicKey", optional=true)
    public native SecKey copyPublicKey();
    @Bridge(symbol="SecTrustGetCertificateCount", optional=true)
    public native @MachineSizedSInt long getCertificateCount();
    @Bridge(symbol="SecTrustGetCertificateAtIndex", optional=true)
    public native SecCertificate getCertificateAtIndex(@MachineSizedSInt long ix);
    @Bridge(symbol="SecTrustCopyExceptions", optional=true)
    public native CFData copyExceptions();
    @Bridge(symbol="SecTrustSetExceptions", optional=true)
    public native boolean setExceptions(CFData exceptions);
    @Bridge(symbol="SecTrustCopyProperties", optional=true)
    public native CFArray copyProperties();
    @Bridge(symbol="SecTrustCopyResult", optional=true)
    public native CFDictionary copyResult();
    @Bridge(symbol="SecTrustSetOCSPResponse", optional=true)
    public native int setOCSPResponse(CFType responseData);
    /*</methods>*/
}
