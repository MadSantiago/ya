package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.search.EnvironmentInitializer;

/* JADX INFO: renamed from: ۦٛؑؕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4593 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0341 f15161 = new C0341(0, null);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0341 f15159 = new C0341(1, null);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3223 f15156 = new C3223(4);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0220 f15162 = new C0220("image-destination");

    /* JADX INFO: renamed from: ۥُ */
    public static final C0220 f15157 = new C0220("image-replacement-text-is-link");

    /* JADX INFO: renamed from: ۥّ */
    public static final C0220 f15158 = new C0220("image-size");

    /* JADX INFO: renamed from: ۦۙ */
    public static final long[] f15163 = new long[0];

    /* JADX INFO: renamed from: ۥۜ */
    public static final C3875 f15160 = new C3875(19);

    /* JADX INFO: renamed from: ۥؓ */
    public static InterfaceC3534 m7963(InterfaceC3534 interfaceC3534, InterfaceC3534 interfaceC3535) {
        return interfaceC3535 == C4794.f15814 ? interfaceC3534 : (InterfaceC3534) interfaceC3535.mo875(new C4876(0), interfaceC3534);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final boolean m7964(C3468 c3468, C5583 c5583) {
        Object[] objArr = new C3468[16];
        if (!c3468.f17791.f17786) {
            AbstractC3480.m6278("visitChildren called on an unattached node");
        }
        C0863 c0863 = new C0863(new AbstractC5381[16]);
        AbstractC5381 abstractC5381 = c3468.f17791;
        AbstractC5381 abstractC5382 = abstractC5381.f17783;
        if (abstractC5382 == null) {
            AbstractC5537.m9249(c0863, abstractC5381);
        } else {
            c0863.m1843(abstractC5382);
        }
        int i = 0;
        while (true) {
            int i2 = c0863.f3180;
            if (i2 == 0) {
                break;
            }
            AbstractC5381 abstractC5381M9233 = (AbstractC5381) c0863.m1850(i2 - 1);
            if ((abstractC5381M9233.f17782 & 1024) == 0) {
                AbstractC5537.m9249(c0863, abstractC5381M9233);
            } else {
                while (abstractC5381M9233 != null) {
                    if ((abstractC5381M9233.f17781 & 1024) != 0) {
                        C0863 c0864 = null;
                        while (abstractC5381M9233 != null) {
                            if (abstractC5381M9233 instanceof C3468) {
                                C3468 c3469 = (C3468) abstractC5381M9233;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c3469;
                                i = i3;
                            } else if ((abstractC5381M9233.f17781 & 1024) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                int i4 = 0;
                                for (AbstractC5381 abstractC5383 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5383 != null; abstractC5383 = abstractC5383.f17783) {
                                    if ((abstractC5383.f17781 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC5381M9233 = abstractC5383;
                                        } else {
                                            if (c0864 == null) {
                                                c0864 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (abstractC5381M9233 != null) {
                                                c0864.m1843(abstractC5381M9233);
                                                abstractC5381M9233 = null;
                                            }
                                            c0864.m1843(abstractC5383);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC5381M9233 = AbstractC5537.m9233(c0864);
                        }
                        break;
                    }
                    abstractC5381M9233 = abstractC5381M9233.f17783;
                }
            }
        }
        Arrays.sort(objArr, 0, i, C1206.f4156);
        for (int i5 = 0; i5 < i; i5++) {
            C3468 c34610 = (C3468) objArr[i5];
            if (AbstractC3925.m7027(c34610) && m7984(c34610, c5583)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to calculate best type for var: r11v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r52v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r52v0 ??, new type: ۦ۟ؗٙ۟
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r54v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r54v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r52v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r52v0 ??, new type: ۦ۟ؗٙ۟
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r54v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r54v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    /* JADX INFO: renamed from: ۥؗ */
    public static final void m7965(p000.InterfaceC0705 r40, p000.C2384 r41, p000.InterfaceC1291 r42, p000.C1604 r43, boolean r44, p000.C2851 r45, int r46, p000.C1298 r47, p000.InterfaceC3028 r48, p000.C4274 r49, p000.C0373 r50, p000.C0857 r51, p000.C5362 r52, int r53, int r54) {
        /*
            Method dump skipped, instruction units count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC4593.m7965(ۥؙٟؑؔ, ۥَۜؕٔ, ۥٌٓؖٓ, ۥ٘ؖ۟ؐ, boolean, ۥٌۧؒؖ, int, ۥٓؗۙ۟, ۦَؑؓٚ, ۦٕٕٙ, ۥؔؑۧۖ, ۥًؖ۠ؒ, ۦ۟ؗٙ۟, int, int):void");
    }

    /* JADX INFO: renamed from: ۥً */
    public static void m7966(C5144 c5144) {
        String str = c5144.f17039;
        m7980(str);
        String[] strArr = {c5144.f17037, c5144.f17040};
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            if (str2 != null) {
                linkedHashSet.add(str2);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            EnvironmentInitializer.m166().m156(str, (String) it.next());
        }
        EnvironmentInitializer.m165().m152(C5787.f19064, new C4441(new long[]{151174302093528170L, 9197324112216327387L, -3474427978396564150L}).toString());
        ArrayList arrayList = C2503.f8322;
        C2503.m4654(AbstractC4009.m7184(R.string.finish_log_info, c5144.f17038));
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final int m7967(InterfaceC0103 interfaceC0103, InterfaceC0103[] interfaceC0103Arr) {
        int iHashCode = (interfaceC0103.mo186().hashCode() * 31) + Arrays.hashCode(interfaceC0103Arr);
        int iMo189 = interfaceC0103.mo189();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo189 > 0)) {
                break;
            }
            int i2 = iMo189 - 1;
            int i3 = i * 31;
            String strMo186 = interfaceC0103.mo190(interfaceC0103.mo189() - iMo189).mo186();
            if (strMo186 != null) {
                iHashCode2 = strMo186.hashCode();
            }
            i = i3 + iHashCode2;
            iMo189 = i2;
        }
        int iMo1810 = interfaceC0103.mo189();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo1810 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMo1810 - 1;
            int i5 = iHashCode3 * 31;
            AbstractC0487 abstractC0487Mo183 = interfaceC0103.mo190(interfaceC0103.mo189() - iMo1810).mo183();
            iHashCode3 = i5 + (abstractC0487Mo183 != null ? abstractC0487Mo183.hashCode() : 0);
            iMo1810 = i4;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final C3501 m7968(InterfaceC2125 interfaceC2125) {
        C3501 c3501 = interfaceC2125 instanceof C3501 ? (C3501) interfaceC2125 : null;
        if (c3501 != null) {
            return c3501;
        }
        C5028.m8453(AbstractC5041.m8557(interfaceC2125.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m7969(C3782 c3782) {
        if ((c3782 instanceof C3782 ? c3782 : null) != null) {
            return;
        }
        C5028.m8453(AbstractC5041.m8557(c3782.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    /* JADX INFO: renamed from: ۥْ */
    public static C0968 m7970(Context context, AttributeSet attributeSet, int i, int i2) {
        C0968 c0968 = new C0968();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2837.f9475, i, i2);
        c0968.f3420 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0968.f3419 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0968.f3418 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0968.f3421 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0968;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final AbstractC4971 m7971(Object obj) {
        if (obj != AbstractC3831.f12710) {
            return (AbstractC4971) obj;
        }
        C1078.m2276("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static final String m7972(InterfaceC0103 interfaceC0103) {
        return AbstractC0973.m2056(AbstractC4554.m7917(0, interfaceC0103.mo189()), ", ", interfaceC0103.mo186() + '(', ")", new C0091(24, interfaceC0103), 24);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final InterfaceC0705 m7973(InterfaceC0705 interfaceC0705) {
        return interfaceC0705.mo1571(new C1426());
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final boolean m7974(C3468 c3468, C5583 c5583) {
        Object[] objArr = new C3468[16];
        if (!c3468.f17791.f17786) {
            AbstractC3480.m6278("visitChildren called on an unattached node");
        }
        C0863 c0863 = new C0863(new AbstractC5381[16]);
        AbstractC5381 abstractC5381 = c3468.f17791;
        AbstractC5381 abstractC5382 = abstractC5381.f17783;
        if (abstractC5382 == null) {
            AbstractC5537.m9249(c0863, abstractC5381);
        } else {
            c0863.m1843(abstractC5382);
        }
        int i = 0;
        while (true) {
            int i2 = c0863.f3180;
            if (i2 == 0) {
                break;
            }
            AbstractC5381 abstractC5381M9233 = (AbstractC5381) c0863.m1850(i2 - 1);
            if ((abstractC5381M9233.f17782 & 1024) == 0) {
                AbstractC5537.m9249(c0863, abstractC5381M9233);
            } else {
                while (abstractC5381M9233 != null) {
                    if ((abstractC5381M9233.f17781 & 1024) != 0) {
                        C0863 c0864 = null;
                        while (abstractC5381M9233 != null) {
                            if (abstractC5381M9233 instanceof C3468) {
                                C3468 c3469 = (C3468) abstractC5381M9233;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c3469;
                                i = i3;
                            } else if ((abstractC5381M9233.f17781 & 1024) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                int i4 = 0;
                                for (AbstractC5381 abstractC5383 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5383 != null; abstractC5383 = abstractC5383.f17783) {
                                    if ((abstractC5383.f17781 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC5381M9233 = abstractC5383;
                                        } else {
                                            if (c0864 == null) {
                                                c0864 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (abstractC5381M9233 != null) {
                                                c0864.m1843(abstractC5381M9233);
                                                abstractC5381M9233 = null;
                                            }
                                            c0864.m1843(abstractC5383);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC5381M9233 = AbstractC5537.m9233(c0864);
                        }
                        break;
                    }
                    abstractC5381M9233 = abstractC5381M9233.f17783;
                }
            }
        }
        Arrays.sort(objArr, 0, i, C1206.f4156);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                C3468 c34610 = (C3468) objArr[i5];
                if (AbstractC3925.m7027(c34610) && m7991(c34610, c5583)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final int m7975(float f, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final long m7976(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static InterfaceC2150 m7977(C1173 c1173, C1489 c1489, ArrayList arrayList, boolean z) {
        InterfaceC2150 interfaceC2150Mo779;
        AbstractC1605.m3371(1, "reduce", arrayList);
        AbstractC1605.m3373("reduce", 2, arrayList);
        InterfaceC2150 interfaceC2150M4397 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
        if (!(interfaceC2150M4397 instanceof AbstractC1079)) {
            C1078.m2272("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            interfaceC2150Mo779 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
            if (interfaceC2150Mo779 instanceof C1710) {
                C1078.m2272("Failed to parse initial value");
                return null;
            }
        } else {
            if (c1173.m2495() == 0) {
                C1078.m2276("Empty array with no initial value error");
                return null;
            }
            interfaceC2150Mo779 = null;
        }
        AbstractC1079 abstractC1079 = (AbstractC1079) interfaceC2150M4397;
        int iM2495 = c1173.m2495();
        int i = z ? 0 : iM2495 - 1;
        int i2 = z ? iM2495 - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (interfaceC2150Mo779 == null) {
            interfaceC2150Mo779 = c1173.m2496(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (c1173.m2497(i)) {
                interfaceC2150Mo779 = abstractC1079.mo779(c1489, Arrays.asList(interfaceC2150Mo779, c1173.m2496(i), new C5563(Double.valueOf(i)), c1173));
                if (interfaceC2150Mo779 instanceof C1710) {
                    C1078.m2276("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return interfaceC2150Mo779;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final int m7978(long j, long[] jArr) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m7979(final InterfaceC4448 interfaceC4448, final C0857 c0857, InterfaceC0705 interfaceC0705, final InterfaceC5731 interfaceC5731, final InterfaceC5731 interfaceC5732, InterfaceC2864 interfaceC2864, long j, long j2, long j3, long j4, C4231 c4231, C5362 c5362, final int i) {
        final InterfaceC0705 interfaceC0706;
        final InterfaceC2864 interfaceC2865;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final C4231 c4232;
        int i2;
        InterfaceC2864 interfaceC2866;
        InterfaceC0705 interfaceC0707;
        long j9;
        long j10;
        long j11;
        C4231 c4233;
        long j12;
        c5362.m8979(94478519);
        int i3 = i | (c5362.m8977(interfaceC4448) ? 4 : 2) | 306212224;
        if (c5362.m9011(i3 & 1, (306783379 & i3) != 306783378)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                InterfaceC2864 interfaceC2864M546 = AbstractC0265.m546(2, c5362);
                long jM216 = AbstractC0118.m216(38, c5362);
                long jM217 = AbstractC0118.m216(31, c5362);
                i2 = i3 & (-2143289345);
                long jM218 = AbstractC0118.m216(18, c5362);
                long jM219 = AbstractC0118.m216(19, c5362);
                C4231 c4234 = new C4231();
                interfaceC2866 = interfaceC2864M546;
                interfaceC0707 = C4217.f13994;
                j9 = jM219;
                j10 = jM217;
                j11 = jM216;
                c4233 = c4234;
                j12 = jM218;
            } else {
                c5362.m8982();
                i2 = i3 & (-2143289345);
                interfaceC0707 = interfaceC0705;
                interfaceC2866 = interfaceC2864;
                j11 = j;
                j10 = j2;
                j12 = j3;
                j9 = j4;
                c4233 = c4231;
            }
            c5362.m8964();
            AbstractC4753.m8078(interfaceC4448, c0857, interfaceC0707, interfaceC5731, interfaceC5732, interfaceC2866, j11, j10, j12, j9, c4233, c5362, i2 & 2147483646, 3456);
            interfaceC0706 = interfaceC0707;
            c4232 = c4233;
            j8 = j9;
            j7 = j12;
            j6 = j10;
            j5 = j11;
            interfaceC2865 = interfaceC2866;
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
            interfaceC2865 = interfaceC2864;
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            c4232 = c4231;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(c0857, interfaceC0706, interfaceC5731, interfaceC5732, interfaceC2865, j5, j6, j7, j8, c4232, i) { // from class: ۦٌؑؑؖ

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ InterfaceC5731 f10150;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ InterfaceC0705 f10151;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ InterfaceC5731 f10152;

                /* JADX INFO: renamed from: ۥٖ */
                public final /* synthetic */ InterfaceC2864 f10153;

                /* JADX INFO: renamed from: ۥٙ */
                public final /* synthetic */ C4231 f10154;

                /* JADX INFO: renamed from: ۥۖ */
                public final /* synthetic */ long f10155;

                /* JADX INFO: renamed from: ۦٕ */
                public final /* synthetic */ long f10156;

                /* JADX INFO: renamed from: ۦٗ */
                public final /* synthetic */ long f10157;

                /* JADX INFO: renamed from: ۦۛ */
                public final /* synthetic */ long f10158;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C0857 f10159;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(1769521);
                    AbstractC4593.m7979(this.f10160, this.f10159, this.f10151, this.f10152, this.f10150, this.f10153, this.f10157, this.f10158, this.f10155, this.f10156, this.f10154, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static void m7980(String str) {
        MMKV mmkvM166 = EnvironmentInitializer.m166();
        if (mmkvM166.m150(str)) {
            mmkvM166.m155(str);
        }
        mmkvM166.trim();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m7981(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            C5028.m8450(e);
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static C1173 m7982(C1173 c1173, C1489 c1489, C2929 c2929, Boolean bool, Boolean bool2) {
        C1173 c1174 = new C1173();
        Iterator itM2500 = c1173.m2500();
        while (itM2500.hasNext()) {
            int iIntValue = ((Integer) itM2500.next()).intValue();
            if (c1173.m2497(iIntValue)) {
                InterfaceC2150 interfaceC2150Mo779 = c2929.mo779(c1489, Arrays.asList(c1173.m2496(iIntValue), new C5563(Double.valueOf(iIntValue)), c1173));
                if (interfaceC2150Mo779.mo1609().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC2150Mo779.mo1609().equals(bool2)) {
                    c1174.m2494(iIntValue, interfaceC2150Mo779);
                }
            }
        }
        return c1174;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final float m7983(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final boolean m7984(C3468 c3468, C5583 c5583) {
        int iOrdinal = c3468.m6254().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C3468 c3468M7033 = AbstractC3925.m7033(c3468);
                if (c3468M7033 != null) {
                    return m7984(c3468M7033, c5583) || m7992(c3468, c3468M7033, 1, c5583);
                }
                C1078.m2276("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c3468.m6250().f4555 ? ((Boolean) c5583.mo211(c3468)).booleanValue() : m7964(c3468, c5583);
                }
                C1078.m2275();
                return false;
            }
        }
        return m7964(c3468, c5583);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final boolean m7985(C3920 c3920, long j) {
        if (!c3920.f17791.f17786) {
            return false;
        }
        C2935 c2935 = (C2935) AbstractC5537.m9270(c3920).f2256.f8206;
        if (!c2935.f9864.f17786) {
            return false;
        }
        long jMo2808 = c2935.mo2808(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo2808 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo2808 & 4294967295L));
        long j2 = c3920.f13067;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static InterfaceC0705 m7986(InterfaceC0705 interfaceC0705, AbstractC0643 abstractC0643, InterfaceC5807 interfaceC5807, InterfaceC1133 interfaceC1133, float f, C1516 c1516, int i) {
        if ((i & 4) != 0) {
            interfaceC5807 = C1298.f4431;
        }
        InterfaceC5807 interfaceC5808 = interfaceC5807;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return interfaceC0705.mo1571(new C1535(abstractC0643, interfaceC5808, interfaceC1133, f, c1516));
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final boolean m7987(Object obj) {
        return obj == AbstractC3831.f12710;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
  0x013a: PHI (r13v13 ۦٖ۠ؒٔ) = (r13v7 ۦٖ۠ؒٔ), (r13v14 ۦٖ۠ؒٔ) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    /* JADX INFO: renamed from: ۦٚ */
    public static final boolean m7988(C3468 c3468, C3468 c3469, int i, C5583 c5583) {
        AbstractC5381 abstractC5381;
        AbstractC5381 abstractC5382;
        C0605 c0605M9270;
        C2457 c2457;
        AbstractC5381 abstractC5381M9233;
        C0863 c0863;
        if (c3468.m6254() != EnumC4125.f13741) {
            C1078.m2276("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new C3468[16];
        if (!c3468.f17791.f17786) {
            AbstractC3480.m6278("visitChildren called on an unattached node");
        }
        C0863 c0864 = new C0863(new AbstractC5381[16]);
        AbstractC5381 abstractC5383 = c3468.f17791;
        AbstractC5381 abstractC5384 = abstractC5383.f17783;
        if (abstractC5384 == null) {
            AbstractC5537.m9249(c0864, abstractC5383);
        } else {
            c0864.m1843(abstractC5384);
        }
        int i2 = 0;
        while (true) {
            int i3 = c0864.f3180;
            abstractC5381 = null;
            if (i3 == 0) {
                break;
            }
            AbstractC5381 abstractC5381M9234 = (AbstractC5381) c0864.m1850(i3 - 1);
            if ((abstractC5381M9234.f17782 & 1024) == 0) {
                AbstractC5537.m9249(c0864, abstractC5381M9234);
            } else {
                while (abstractC5381M9234 != null) {
                    if ((abstractC5381M9234.f17781 & 1024) != 0) {
                        C0863 c0865 = null;
                        while (abstractC5381M9234 != null) {
                            if (abstractC5381M9234 instanceof C3468) {
                                C3468 c34610 = (C3468) abstractC5381M9234;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = c34610;
                                i2 = i4;
                            } else if ((abstractC5381M9234.f17781 & 1024) != 0 && (abstractC5381M9234 instanceof AbstractC3019)) {
                                int i5 = 0;
                                for (AbstractC5381 abstractC5385 = ((AbstractC3019) abstractC5381M9234).f10167; abstractC5385 != null; abstractC5385 = abstractC5385.f17783) {
                                    if ((abstractC5385.f17781 & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            abstractC5381M9234 = abstractC5385;
                                        } else {
                                            if (c0865 == null) {
                                                c0865 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (abstractC5381M9234 != null) {
                                                c0865.m1843(abstractC5381M9234);
                                                abstractC5381M9234 = null;
                                            }
                                            c0865.m1843(abstractC5385);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC5381M9234 = AbstractC5537.m9233(c0865);
                        }
                        break;
                    }
                    abstractC5381M9234 = abstractC5381M9234.f17783;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, C1206.f4156);
        if (i != 1) {
            if (i != 2) {
                C1078.m2276("This function should only be used for 1-D focus search");
                return false;
            }
            C3046 c3046M7917 = AbstractC4554.m7917(0, i2);
            int i6 = c3046M7917.f6006;
            int i7 = c3046M7917.f6005;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        C3468 c34611 = (C3468) objArr[i7];
                        if (AbstractC3925.m7027(c34611) && m7991(c34611, c5583)) {
                            return true;
                        }
                    }
                    if (AbstractC3831.m6874(objArr[i7], c3469)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!c3468.f17791.f17786) {
                    AbstractC3480.m6278("visitAncestors called on an unattached node");
                }
                abstractC5382 = c3468.f17791.f17780;
                c0605M9270 = AbstractC5537.m9270(c3468);
                loop5: while (c0605M9270 != null) {
                    if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 1024) != 0) {
                        while (abstractC5382 != null) {
                            if ((abstractC5382.f17781 & 1024) != 0) {
                                abstractC5381M9233 = abstractC5382;
                                c0863 = null;
                                while (abstractC5381M9233 != null) {
                                    if (abstractC5381M9233 instanceof C3468) {
                                        abstractC5381 = abstractC5381M9233;
                                        break loop5;
                                    }
                                    if ((abstractC5381M9233.f17781 & 1024) == 0) {
                                    }
                                    abstractC5381M9233 = AbstractC5537.m9233(c0863);
                                }
                            }
                            abstractC5382 = abstractC5382.f17780;
                        }
                    }
                    c0605M9270 = c0605M9270.m1356();
                    if (c0605M9270 != null) {
                    }
                }
                if (abstractC5381 != null) {
                    return ((Boolean) c5583.mo211(c3468)).booleanValue();
                }
            }
            return false;
        }
        C3046 c3046M7918 = AbstractC4554.m7917(0, i2);
        int i8 = c3046M7918.f6006;
        int i9 = c3046M7918.f6005;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    C3468 c34612 = (C3468) objArr[i8];
                    if (AbstractC3925.m7027(c34612) && m7984(c34612, c5583)) {
                        return true;
                    }
                }
                if (AbstractC3831.m6874(objArr[i8], c3469)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && c3468.m6250().f4555) {
            if (!c3468.f17791.f17786) {
                AbstractC3480.m6278("visitAncestors called on an unattached node");
            }
            abstractC5382 = c3468.f17791.f17780;
            c0605M9270 = AbstractC5537.m9270(c3468);
            loop5: while (c0605M9270 != null) {
                if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 1024) != 0) {
                    while (abstractC5382 != null) {
                        if ((abstractC5382.f17781 & 1024) != 0) {
                            abstractC5381M9233 = abstractC5382;
                            c0863 = null;
                            while (abstractC5381M9233 != null) {
                                if (abstractC5381M9233 instanceof C3468) {
                                    abstractC5381 = abstractC5381M9233;
                                    break loop5;
                                }
                                if ((abstractC5381M9233.f17781 & 1024) == 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                    int i10 = 0;
                                    for (AbstractC5381 abstractC5386 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5386 != null; abstractC5386 = abstractC5386.f17783) {
                                        if ((abstractC5386.f17781 & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC5381M9233 = abstractC5386;
                                            } else {
                                                if (c0863 == null) {
                                                    c0863 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (abstractC5381M9233 != null) {
                                                    c0863.m1843(abstractC5381M9233);
                                                    abstractC5381M9233 = null;
                                                }
                                                c0863.m1843(abstractC5386);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC5381M9233 = AbstractC5537.m9233(c0863);
                            }
                        }
                        abstractC5382 = abstractC5382.f17780;
                    }
                }
                c0605M9270 = c0605M9270.m1356();
                abstractC5382 = (c0605M9270 != null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
            }
            if (abstractC5381 != null) {
                return ((Boolean) c5583.mo211(c3468)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static InterfaceC4707 m7989(InterfaceC4707 interfaceC4707, int i) {
        int i2;
        if (i < 0 && i != -2 && i != -1) {
            C1078.m2273(AbstractC5078.m8670(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            i2 = 2;
        } else {
            i2 = 1;
        }
        boolean z = interfaceC4707 instanceof InterfaceC4636;
        C4794 c4794 = C4794.f15814;
        return z ? ((InterfaceC4636) interfaceC4707).mo1913(c4794, i, i2) : new C2072(interfaceC4707, c4794, i, i2);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final Object m7990(InterfaceC1550 interfaceC1550, String str, AbstractC0772 abstractC0772) {
        Object objMo467 = interfaceC1550.mo467(str, new C1657(27), abstractC0772);
        return objMo467 == EnumC2282.f7590 ? objMo467 : C2358.f7817;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    /* JADX INFO: renamed from: ۦۙ */
    public static final boolean m7991(C3468 c3468, C5583 c5583) {
        int iOrdinal = c3468.m6254().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C3468 c3468M7033 = AbstractC3925.m7033(c3468);
                if (c3468M7033 == null) {
                    C1078.m2276("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = c3468M7033.m6254().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (m7991(c3468M7033, c5583) || m7992(c3468, c3468M7033, 2, c5583) || (c3468M7033.m6250().f4555 && ((Boolean) c5583.mo211(c3468M7033)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            C1078.m2275();
                            return false;
                        }
                        C1078.m2276("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return m7992(c3468, c3468M7033, 2, c5583);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C1078.m2275();
                    return false;
                }
                if (!m7974(c3468, c5583)) {
                    if (!(c3468.m6250().f4555 ? ((Boolean) c5583.mo211(c3468)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return m7974(c3468, c5583);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final boolean m7992(C3468 c3468, C3468 c3469, int i, C5583 c5583) {
        if (m7988(c3468, c3469, i, c5583)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC0993.m2141(c3468, i, new C4934(((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(c3468)).getFocusOwner()).m3926(), c3468, c3469, i, c5583, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final float m7993(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static long m7994(Context context, int i) {
        return AbstractC4225.m7468(context.getResources().getColor(i, context.getTheme()));
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final InterfaceC3983 m7995(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            InterfaceC3983 interfaceC3983 = tag instanceof InterfaceC3983 ? (InterfaceC3983) tag : null;
            if (interfaceC3983 != null) {
                return interfaceC3983;
            }
            Object objM7476 = AbstractC4225.m7476(view);
            view = objM7476 instanceof View ? (View) objM7476 : null;
        }
        return null;
    }
}
