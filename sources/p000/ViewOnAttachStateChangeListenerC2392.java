package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥؙۜؖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2392 extends C0004 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: ۦ۠ */
    public static final C4523 f7926;

    /* JADX INFO: renamed from: ۥؓ */
    public C5817 f7927;

    /* JADX INFO: renamed from: ۥؔ */
    public C0319 f7928;

    /* JADX INFO: renamed from: ۥؖ */
    public int f7929;

    /* JADX INFO: renamed from: ۥؙ */
    public boolean f7930;

    /* JADX INFO: renamed from: ۥؚ */
    public C1900 f7931;

    /* JADX INFO: renamed from: ۥً */
    public boolean f7932;

    /* JADX INFO: renamed from: ۥٓ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f7934;

    /* JADX INFO: renamed from: ۥٕ */
    public final C4912 f7935;

    /* JADX INFO: renamed from: ۥ٘ */
    public final C5251 f7937;

    /* JADX INFO: renamed from: ۥٙ */
    public int f7938;

    /* JADX INFO: renamed from: ۥٛ */
    public final C5251 f7939;

    /* JADX INFO: renamed from: ۥٝ */
    public final C5460 f7940;

    /* JADX INFO: renamed from: ۥۖ */
    public List f7941;

    /* JADX INFO: renamed from: ۥۙ */
    public final C1870 f7942;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C4912 f7943;

    /* JADX INFO: renamed from: ۥۡ */
    public final C5251 f7944;

    /* JADX INFO: renamed from: ۥۤ */
    public final String f7945;

    /* JADX INFO: renamed from: ۥۥ */
    public final ArrayList f7946;

    /* JADX INFO: renamed from: ۥۦ */
    public Integer f7947;

    /* JADX INFO: renamed from: ۥۧ */
    public C5817 f7948;

    /* JADX INFO: renamed from: ۥۨ */
    public final C4080 f7949;

    /* JADX INFO: renamed from: ۦؒ */
    public final String f7950;

    /* JADX INFO: renamed from: ۦؖ */
    public int f7951;

    /* JADX INFO: renamed from: ۦؗ */
    public final C1821 f7952;

    /* JADX INFO: renamed from: ۦؙ */
    public final C1870 f7953;

    /* JADX INFO: renamed from: ۦُ */
    public final C5559 f7954;

    /* JADX INFO: renamed from: ۦٕ */
    public final C0837 f7955;

    /* JADX INFO: renamed from: ۦٖ */
    public boolean f7956;

    /* JADX INFO: renamed from: ۦٗ */
    public final AccessibilityManager f7957;

    /* JADX INFO: renamed from: ۦٚ */
    public final C4912 f7958;

    /* JADX INFO: renamed from: ۦۜ */
    public C4912 f7960;

    /* JADX INFO: renamed from: ۦۣ */
    public final C0482 f7961;

    /* JADX INFO: renamed from: ۦۧ */
    public final RunnableC0029 f7962;

    /* JADX INFO: renamed from: ۥَ */
    public int f7933 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥٖ */
    public final C4080 f7936 = new C4080(this, 0);

    /* JADX INFO: renamed from: ۦۛ */
    public long f7959 = 100;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C4523 c4523 = AbstractC0549.f1967;
        C4523 c4524 = new C4523(32);
        int i = c4524.f14948;
        if (i < 0) {
            AbstractC2552.m4812("");
            throw null;
        }
        int i2 = i + 32;
        c4524.m7842(i2);
        int[] iArr2 = c4524.f14949;
        int i3 = c4524.f14948;
        if (i != i3) {
            AbstractC0246.m523(i2, i, i3, iArr2, iArr2);
        }
        AbstractC0246.m516(i, 0, 12, iArr, iArr2);
        c4524.f14948 += 32;
        f7926 = c4524;
    }

    public ViewOnAttachStateChangeListenerC2392(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        this.f7934 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f7957 = (AccessibilityManager) viewTreeObserverOnGlobalLayoutListenerC0850.getContext().getSystemService("accessibility");
        new Handler(Looper.getMainLooper());
        this.f7955 = new C0837(this);
        this.f7938 = Integer.MIN_VALUE;
        this.f7929 = Integer.MIN_VALUE;
        this.f7958 = new C4912();
        this.f7935 = new C4912();
        this.f7942 = new C1870(0);
        this.f7953 = new C1870(0);
        this.f7951 = -1;
        this.f7952 = new C1821(0);
        this.f7954 = AbstractC1631.m3405(1, 0, 6);
        this.f7956 = true;
        C4912 c4912 = AbstractC0137.f547;
        this.f7960 = c4912;
        this.f7961 = new C0482();
        this.f7937 = new C5251();
        this.f7939 = new C5251();
        this.f7945 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f7950 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f7940 = new C5460(7);
        this.f7943 = new C4912();
        this.f7931 = new C1900(viewTreeObserverOnGlobalLayoutListenerC0850.getSemanticsOwner().m9199(), c4912);
        int i = AbstractC1724.f5746;
        this.f7944 = new C5251();
        viewTreeObserverOnGlobalLayoutListenerC0850.addOnAttachStateChangeListener(this);
        this.f7962 = new RunnableC0029(2, this);
        this.f7946 = new ArrayList();
        this.f7949 = new C4080(this, 1);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static /* synthetic */ void m4479(ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC2392.m4495(i, i2, num, null);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final boolean m4480(C4323 c4323, float f) {
        InterfaceC4448 interfaceC4448 = c4323.f14290;
        if (f >= 0.0f || ((Number) interfaceC4448.mo449()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) interfaceC4448.mo449()).floatValue() < ((Number) c4323.f14289.mo449()).floatValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final boolean m4481(C4323 c4323) {
        InterfaceC4448 interfaceC4448 = c4323.f14290;
        if (((Number) interfaceC4448.mo449()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) interfaceC4448.mo449()).floatValue();
        ((Number) c4323.f14289.mo449()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static float[] m4482(AbstractC3925 abstractC3925) {
        if (!(abstractC3925 instanceof C4996)) {
            return null;
        }
        C5293 c5293 = ((C4996) abstractC3925).f16536;
        long j = c5293.f17434;
        long j2 = c5293.f17437;
        long j3 = c5293.f17432;
        long j4 = c5293.f17431;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static Region m4483(AbstractC3925 abstractC3925, float f, float f2) {
        if (!(abstractC3925 instanceof C0889)) {
            return null;
        }
        C0889 c0889 = (C0889) abstractC3925;
        C2793 c2793M5320 = c0889.mo1881().m5320(f, f2);
        Region region = new Region(new Rect((int) (c2793M5320.f9343 + 0.0f), (int) (c2793M5320.f9342 + 0.0f), (int) (c2793M5320.f9341 + 0.0f), (int) (c2793M5320.f9344 + 0.0f)));
        Region region2 = new Region();
        C0935 c0935 = c0889.f3231;
        if (!(c0935 instanceof C0935)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c0935.f3328;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static Rect m4484(AbstractC3925 abstractC3925, float f, float f2) {
        if (!(abstractC3925 instanceof C2490) && !(abstractC3925 instanceof C4996)) {
            return null;
        }
        C2793 c2793Mo1881 = abstractC3925.mo1881();
        return new Rect((int) (c2793Mo1881.f9343 + f), (int) (c2793Mo1881.f9342 + f2), (int) (c2793Mo1881.f9341 + f), (int) (c2793Mo1881.f9344 + f2));
    }

    /* JADX INFO: renamed from: ۦُ */
    public static CharSequence m4485(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final boolean m4486(C4323 c4323) {
        InterfaceC4448 interfaceC4448 = c4323.f14290;
        if (((Number) interfaceC4448.mo449()).floatValue() < ((Number) c4323.f14289.mo449()).floatValue()) {
            return true;
        }
        ((Number) interfaceC4448.mo449()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static String m4487(C3129 c3129) {
        C1249 c1249;
        if (c3129 != null) {
            C2542 c2542 = c3129.f10476;
            C3262 c3262 = c2542.f8490;
            C3059 c3059 = AbstractC2771.f9213;
            if (c3262.m6015(c3059)) {
                return AbstractC0844.m1757((List) c2542.m4771(c3059), ",", null, 62);
            }
            C3059 c30510 = AbstractC2771.f9219;
            if (c3262.m6015(c30510)) {
                Object objM6027 = c3262.m6027(c30510);
                if (objM6027 == null) {
                    objM6027 = null;
                }
                C1249 c12410 = (C1249) objM6027;
                if (c12410 != null) {
                    return c12410.f4307;
                }
            } else {
                Object objM6028 = c3262.m6027(AbstractC2771.f9198);
                if (objM6028 == null) {
                    objM6028 = null;
                }
                List list = (List) objM6028;
                if (list != null && (c1249 = (C1249) AbstractC0973.m2058(list)) != null) {
                    return c1249.f4307;
                }
            }
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f7941 = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f7941 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f7957;
        if (accessibilityManager.isEnabled()) {
            this.f7941 = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7934.getHandler().removeCallbacks(this.f7962);
        AccessibilityManager accessibilityManager = this.f7957;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m4488(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventM4503 = m4503(m4511(i), 32);
        accessibilityEventM4503.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventM4503.getText().add(str);
        }
        m4504(accessibilityEventM4503);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024e  */
    /* JADX WARN: Code duplicated, block: B:102:0x025b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0284  */
    /* JADX WARN: Code duplicated, block: B:109:0x0295  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:114:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fd A[LOOP:4: B:133:0x02ec->B:138:0x02fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x030b  */
    /* JADX WARN: Code duplicated, block: B:146:0x031f A[LOOP:5: B:141:0x0307->B:146:0x031f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x0345  */
    /* JADX WARN: Code duplicated, block: B:158:0x034f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0377  */
    /* JADX WARN: Code duplicated, block: B:167:0x0398  */
    /* JADX WARN: Code duplicated, block: B:169:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:170:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:172:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:174:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:182:0x0422  */
    /* JADX WARN: Code duplicated, block: B:186:0x0431  */
    /* JADX WARN: Code duplicated, block: B:212:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:236:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:239:0x050c A[LOOP:6: B:235:0x04f9->B:239:0x050c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x0516  */
    /* JADX WARN: Code duplicated, block: B:246:0x0523  */
    /* JADX WARN: Code duplicated, block: B:249:0x0530 A[PHI: r0 r7 r8 r13 r14 r15 r28 r38 r41 r53
  0x0530: PHI (r0v18 ۥؙۜؖۚ) = (r0v10 ۥؙۜؖۚ), (r0v10 ۥؙۜؖۚ), (r0v10 ۥؙۜؖۚ), (r0v10 ۥؙۜؖۚ), (r0v19 ۥؙۜؖۚ) binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r7v31 int) = (r7v14 int), (r7v14 int), (r7v14 int), (r7v14 int), (r7v32 int) binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r8v41 java.lang.Integer) = 
  (r8v25 java.lang.Integer)
  (r8v25 java.lang.Integer)
  (r8v25 java.lang.Integer)
  (r8v25 java.lang.Integer)
  (r8v42 java.lang.Integer)
 binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r13v54 int) = (r13v42 int), (r13v42 int), (r13v42 int), (r13v42 int), (r13v55 int) binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r14v41 ۦؙؕؒٗ) = (r14v30 ۦؙؕؒٗ), (r14v30 ۦؙؕؒٗ), (r14v30 ۦؙؕؒٗ), (r14v30 ۦؙؕؒٗ), (r14v42 ۦؙؕؒٗ) binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r15v37 ۥؗؕؖۧ) = (r15v36 ۥؗؕؖۧ), (r15v36 ۥؗؕؖۧ), (r15v36 ۥؗؕؖۧ), (r15v36 ۥؗؕؖۧ), (r15v38 ۥؗؕؖۧ) binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r28v3 int) = (r28v2 int), (r28v2 int), (r28v2 int), (r28v2 int), (r28v4 int) binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r38v12 int) = (r38v7 int), (r38v9 int), (r38v10 int), (r38v7 int), (r38v13 int) binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r41v6 ۦۣؒؖؗ) = (r41v4 ۦۣؒؖؗ), (r41v4 ۦۣؒؖؗ), (r41v4 ۦۣؒؖؗ), (r41v4 ۦۣؒؖؗ), (r41v7 ۦۣؒؖؗ) binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r53v16 java.lang.Integer) = 
  (r53v12 java.lang.Integer)
  (r53v12 java.lang.Integer)
  (r53v12 java.lang.Integer)
  (r53v12 java.lang.Integer)
  (r53v17 java.lang.Integer)
 binds: [B:248:0x052e, B:233:0x04ee, B:212:0x04b9, B:211:0x04b7, B:106:0x0281] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:250:0x0532  */
    /* JADX WARN: Code duplicated, block: B:275:0x0602  */
    /* JADX WARN: Code duplicated, block: B:297:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0306 A[EDGE_INSN: B:298:0x0306->B:140:0x0306 BREAK  A[LOOP:4: B:133:0x02ec->B:138:0x02fd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0324 A[EDGE_INSN: B:299:0x0324->B:148:0x0324 BREAK  A[LOOP:5: B:141:0x0307->B:146:0x031f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0505 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:59:0x015a  */
    /* JADX WARN: Code duplicated, block: B:60:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:63:0x018c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0194  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x01be  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0216  */
    /* JADX WARN: Code duplicated, block: B:89:0x0224  */
    /* JADX WARN: Code duplicated, block: B:92:0x0237  */
    /* JADX WARN: Code duplicated, block: B:95:0x023f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0246  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /* JADX INFO: renamed from: ۥً */
    public final void m4489(AbstractC5746 abstractC5746) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        C2542 c2542;
        C3129 c3129;
        int i8;
        int i9;
        int i10;
        int i11;
        C3262 c3262;
        C0605 c0605;
        int i12;
        C2542 c2543;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i13;
        C0605 c0606;
        int i14;
        Integer num6;
        int i15;
        C0967 c0967;
        boolean z;
        C3059 c3059;
        int i16;
        C3059 c30510;
        C3059 c30511;
        String str;
        C3059 c30512;
        int size;
        int i17;
        C0967 c0968;
        Object objM6027;
        Object objM6028;
        InterfaceC0400 interfaceC0400;
        int i18;
        Object objM6029;
        C1249 c1249;
        String str2;
        Object objM60210;
        C1249 c12410;
        Object objM60211;
        CharSequence charSequence;
        CharSequence charSequenceM4485;
        int length;
        int length2;
        int i19;
        Integer num7;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean zM6015;
        boolean z2;
        boolean z3;
        AccessibilityEvent accessibilityEventM4508;
        Object objM60212;
        C2155 c2155;
        Object objM60213;
        AccessibilityEvent accessibilityEventM4503;
        Object objM60214;
        String strM1757;
        Object objM60215;
        List list;
        String strM1758;
        String str3;
        boolean zM6016;
        int i24;
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = this;
        AbstractC5746 abstractC5747 = abstractC5746;
        Integer num8 = 64;
        ArrayList arrayList4 = viewOnAttachStateChangeListenerC2392.f7946;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = abstractC5747.f18947;
        long[] jArr3 = abstractC5747.f18948;
        int i25 = 2;
        int length3 = jArr3.length - 2;
        int i26 = 0;
        Integer num9 = 0;
        if (length3 < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j2 = jArr3[i27];
            int i28 = i25;
            int i29 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i30 = 8;
                int i31 = 8 - ((~(i27 - i29)) >>> 31);
                long j3 = j2;
                int i32 = i26;
                while (i32 < i31) {
                    if ((j3 & 255) < 128) {
                        int i33 = iArr3[(i27 << 3) + i32];
                        C1900 c1900 = (C1900) viewOnAttachStateChangeListenerC2392.f7943.m9571(i33);
                        if (c1900 == null) {
                            i3 = i32;
                            num3 = num8;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i31;
                            i5 = i26;
                            i6 = i27;
                            num4 = num9;
                            i7 = i30;
                        } else {
                            C2542 c2544 = c1900.f6282;
                            C3262 c3263 = c2544.f8490;
                            C1307 c1307 = (C1307) abstractC5747.m9571(i33);
                            int i34 = i30;
                            C3129 c31210 = c1307 != null ? c1307.f4492 : null;
                            if (c31210 == null) {
                                throw AbstractC3761.m6633("no value for specified key");
                            }
                            C0605 c0607 = c31210.f10471;
                            C2542 c2545 = c31210.f10476;
                            iArr2 = iArr3;
                            int i35 = c31210.f10473;
                            jArr2 = jArr3;
                            C3262 c3264 = c2545.f8490;
                            i6 = i27;
                            Object[] objArr = c3264.f10947;
                            Object[] objArr2 = c3264.f10944;
                            long[] jArr4 = c3264.f10948;
                            i3 = i32;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                C0605 c0608 = c0607;
                                i4 = i31;
                                int i36 = 0;
                                i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i36];
                                    c3129 = c31210;
                                    int i37 = i36;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length4)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j4 & 255) < 128) {
                                                int i40 = (i37 << 3) + i39;
                                                Object obj = objArr[i40];
                                                int i41 = length4;
                                                Object obj2 = objArr2[i40];
                                                c2543 = c2544;
                                                C3059 c30513 = (C3059) obj;
                                                j = j4;
                                                C3059 c30514 = AbstractC2771.f9232;
                                                if (AbstractC3831.m6874(c30513, c30514) || AbstractC3831.m6874(c30513, AbstractC2771.f9209)) {
                                                    int size2 = arrayList5.size();
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (i42 >= size2) {
                                                            c0967 = null;
                                                            break;
                                                        }
                                                        int i43 = size2;
                                                        if (((C0967) arrayList5.get(i42)).f3417 == i33) {
                                                            c0967 = (C0967) arrayList5.get(i42);
                                                            break;
                                                        } else {
                                                            i42++;
                                                            size2 = i43;
                                                        }
                                                    }
                                                    if (c0967 != null) {
                                                        z = false;
                                                    } else {
                                                        c0967 = new C0967(i33, arrayList4);
                                                        z = true;
                                                    }
                                                    arrayList4.add(c0967);
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    c3059 = AbstractC2771.f9216;
                                                    if (AbstractC3831.m6874(c30513, c3059)) {
                                                        str3 = (String) obj2;
                                                        zM6016 = c3263.m6015(c3059);
                                                        i24 = i34;
                                                        if (zM6016) {
                                                            viewOnAttachStateChangeListenerC2392.m4488(i33, i24, str3);
                                                        }
                                                    } else {
                                                        i16 = i34;
                                                        if (AbstractC3831.m6874(c30513, AbstractC2771.f9210)) {
                                                            m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num8, i16);
                                                            m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, i16);
                                                        } else if (AbstractC3831.m6874(c30513, AbstractC2771.f9222)) {
                                                            m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, 8192, 8);
                                                            m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, 8);
                                                        } else if (AbstractC3831.m6874(c30513, AbstractC2771.f9195)) {
                                                            m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, 3072, 8);
                                                        } else if (AbstractC3831.m6874(c30513, AbstractC2771.f9197)) {
                                                            m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num8, 8);
                                                            m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, 8);
                                                        } else {
                                                            c30510 = AbstractC2771.f9218;
                                                            arrayList3 = arrayList5;
                                                            if (AbstractC3831.m6874(c30513, c30510)) {
                                                                objM60212 = c3264.m6027(AbstractC2771.f9196);
                                                                if (objM60212 == null) {
                                                                    objM60212 = null;
                                                                }
                                                                c2155 = (C2155) objM60212;
                                                                if (c2155 == null && c2155.f7116 == 4) {
                                                                    objM60213 = c3264.m6027(c30510);
                                                                    if (objM60213 == null) {
                                                                        objM60213 = null;
                                                                    }
                                                                    if (AbstractC3831.m6874(objM60213, Boolean.TRUE)) {
                                                                        accessibilityEventM4503 = viewOnAttachStateChangeListenerC2392.m4503(viewOnAttachStateChangeListenerC2392.m4511(i33), 4);
                                                                        C3129 c31211 = c3129;
                                                                        c0606 = c0608;
                                                                        C3129 c31212 = new C3129(c31211.f10475, true, c0606, c2545);
                                                                        objM60214 = c31212.m5769().f8490.m6027(AbstractC2771.f9213);
                                                                        if (objM60214 == null) {
                                                                            objM60214 = null;
                                                                        }
                                                                        List list2 = (List) objM60214;
                                                                        c3129 = c31211;
                                                                        strM1757 = list2 != null ? AbstractC0844.m1757(list2, ",", null, 62) : null;
                                                                        objM60215 = c31212.m5769().f8490.m6027(AbstractC2771.f9198);
                                                                        if (objM60215 == null) {
                                                                            objM60215 = null;
                                                                        }
                                                                        list = (List) objM60215;
                                                                        i13 = i38;
                                                                        if (list != null) {
                                                                            strM1758 = AbstractC0844.m1757(list, ",", null, 62);
                                                                        } else {
                                                                            strM1758 = null;
                                                                        }
                                                                        if (strM1757 != null) {
                                                                            accessibilityEventM4503.setContentDescription(strM1757);
                                                                        }
                                                                        if (strM1758 != null) {
                                                                            accessibilityEventM4503.getText().add(strM1758);
                                                                        }
                                                                        viewOnAttachStateChangeListenerC2392.m4504(accessibilityEventM4503);
                                                                    } else {
                                                                        i13 = i38;
                                                                        c0606 = c0608;
                                                                        m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, 8);
                                                                    }
                                                                } else {
                                                                    i13 = i38;
                                                                    c0606 = c0608;
                                                                    m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num8, 8);
                                                                    m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, 8);
                                                                }
                                                            } else {
                                                                i13 = i38;
                                                                c0606 = c0608;
                                                                if (AbstractC3831.m6874(c30513, AbstractC2771.f9213)) {
                                                                    viewOnAttachStateChangeListenerC2392.m4495(viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, 4, (List) obj2);
                                                                } else {
                                                                    c30511 = AbstractC2771.f9219;
                                                                    str = "";
                                                                    if (AbstractC3831.m6874(c30513, c30511)) {
                                                                        if (c3264.m6015(AbstractC0208.f783)) {
                                                                            objM60210 = c3263.m6027(c30511);
                                                                            if (objM60210 == null) {
                                                                                objM60210 = null;
                                                                            }
                                                                            c12410 = (C1249) objM60210;
                                                                            if (c12410 == null) {
                                                                                c12410 = "";
                                                                            }
                                                                            objM60211 = c3264.m6027(c30511);
                                                                            if (objM60211 == null) {
                                                                                objM60211 = null;
                                                                            }
                                                                            charSequence = (C1249) objM60211;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceM4485 = m4485(charSequence);
                                                                            length = c12410.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i19 = length2;
                                                                            } else {
                                                                                i19 = length;
                                                                            }
                                                                            num7 = num9;
                                                                            i20 = 0;
                                                                            while (true) {
                                                                                num5 = num8;
                                                                                if (i20 < i19) {
                                                                                    i21 = length;
                                                                                    break;
                                                                                }
                                                                                i21 = length;
                                                                                if (c12410.charAt(i20) != charSequence.charAt(i20)) {
                                                                                    break;
                                                                                }
                                                                                i20++;
                                                                                length = i21;
                                                                                num8 = num5;
                                                                            }
                                                                            i22 = 0;
                                                                            while (true) {
                                                                                if (i22 < i19 - i20) {
                                                                                    i23 = i22;
                                                                                    break;
                                                                                }
                                                                                i23 = i22;
                                                                                if (c12410.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                    break;
                                                                                } else {
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                            }
                                                                            int i44 = (i21 - i23) - i20;
                                                                            int i45 = (length2 - i23) - i20;
                                                                            C3059 c30515 = AbstractC2771.f9225;
                                                                            boolean zM6017 = c3263.m6015(c30515);
                                                                            boolean zM6018 = c3264.m6015(c30515);
                                                                            zM6015 = c3263.m6015(AbstractC2771.f9219);
                                                                            if (zM6015 || zM6017 || !zM6018) {
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            if (zM6015 || !zM6017 || zM6018) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                            }
                                                                            if (!z2 || z3) {
                                                                                i15 = i33;
                                                                                num9 = num7;
                                                                                accessibilityEventM4508 = viewOnAttachStateChangeListenerC2392.m4508(viewOnAttachStateChangeListenerC2392.m4511(i33), num9, num7, Integer.valueOf(length2), charSequenceM4485);
                                                                            } else {
                                                                                accessibilityEventM4508 = viewOnAttachStateChangeListenerC2392.m4503(viewOnAttachStateChangeListenerC2392.m4511(i33), 16);
                                                                                accessibilityEventM4508.setFromIndex(i20);
                                                                                accessibilityEventM4508.setRemovedCount(i44);
                                                                                accessibilityEventM4508.setAddedCount(i45);
                                                                                accessibilityEventM4508.setBeforeText(c12410);
                                                                                accessibilityEventM4508.getText().add(charSequenceM4485);
                                                                                i15 = i33;
                                                                                num9 = num7;
                                                                            }
                                                                            accessibilityEventM4508.setClassName("android.widget.EditText");
                                                                            viewOnAttachStateChangeListenerC2392.m4504(accessibilityEventM4508);
                                                                            if (z2 || z3) {
                                                                                long j5 = ((C3346) c2545.m4771(AbstractC2771.f9217)).f11197;
                                                                                accessibilityEventM4508.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventM4508.setToIndex((int) (j5 & 4294967295L));
                                                                                viewOnAttachStateChangeListenerC2392.m4504(accessibilityEventM4508);
                                                                            }
                                                                        } else {
                                                                            i15 = i33;
                                                                            c3263 = c3263;
                                                                            num5 = num8;
                                                                            m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i15), 2048, Integer.valueOf(i28), 8);
                                                                        }
                                                                        num6 = num9;
                                                                        i14 = i41;
                                                                    } else {
                                                                        i15 = i33;
                                                                        c3263 = c3263;
                                                                        num5 = num8;
                                                                        i14 = i41;
                                                                        c30512 = AbstractC2771.f9217;
                                                                        if (AbstractC3831.m6874(c30513, c30512)) {
                                                                            objM6029 = c3264.m6027(c30511);
                                                                            if (objM6029 == null) {
                                                                                objM6029 = null;
                                                                            }
                                                                            c1249 = (C1249) objM6029;
                                                                            if (c1249 != null && (str2 = c1249.f4307) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((C3346) c2545.m4771(c30512)).f11197;
                                                                            num6 = num9;
                                                                            viewOnAttachStateChangeListenerC2392 = this;
                                                                            viewOnAttachStateChangeListenerC2392.m4504(viewOnAttachStateChangeListenerC2392.m4508(viewOnAttachStateChangeListenerC2392.m4511(i15), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), m4485(str)));
                                                                            viewOnAttachStateChangeListenerC2392.m4499(i35);
                                                                        } else {
                                                                            num6 = num9;
                                                                            if (!AbstractC3831.m6874(c30513, c30514) || AbstractC3831.m6874(c30513, AbstractC2771.f9209)) {
                                                                                viewOnAttachStateChangeListenerC2392.m4493(c0606);
                                                                                size = arrayList4.size();
                                                                                i17 = 0;
                                                                                while (true) {
                                                                                    if (i17 >= size) {
                                                                                        c0968 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((C0967) arrayList4.get(i17)).f3417 == i15) {
                                                                                            c0968 = (C0967) arrayList4.get(i17);
                                                                                            break;
                                                                                        }
                                                                                        i17++;
                                                                                    }
                                                                                }
                                                                                objM6027 = c3264.m6027(c30514);
                                                                                if (objM6027 == null) {
                                                                                    objM6027 = null;
                                                                                }
                                                                                c0968.f3412 = (C4323) objM6027;
                                                                                objM6028 = c3264.m6027(AbstractC2771.f9209);
                                                                                if (objM6028 == null) {
                                                                                    objM6028 = null;
                                                                                }
                                                                                c0968.f3415 = (C4323) objM6028;
                                                                                if (c0968.f3416.contains(c0968)) {
                                                                                    viewOnAttachStateChangeListenerC2392.f7934.getSnapshotObserver().f5926.m9077(c0968, viewOnAttachStateChangeListenerC2392.f7949, new C5304(1, c0968, viewOnAttachStateChangeListenerC2392));
                                                                                }
                                                                            } else if (AbstractC3831.m6874(c30513, AbstractC2771.f9220)) {
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i18 = 8;
                                                                                    viewOnAttachStateChangeListenerC2392.m4504(viewOnAttachStateChangeListenerC2392.m4503(viewOnAttachStateChangeListenerC2392.m4511(i35), 8));
                                                                                } else {
                                                                                    i18 = 8;
                                                                                }
                                                                                m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i35), 2048, num6, i18);
                                                                            } else {
                                                                                C3059 c30516 = AbstractC0208.f780;
                                                                                if (AbstractC3831.m6874(c30513, c30516)) {
                                                                                    List list3 = (List) c2545.m4771(c30516);
                                                                                    Object objM60216 = c3263.m6027(c30516);
                                                                                    if (objM60216 == null) {
                                                                                        objM60216 = null;
                                                                                    }
                                                                                    List list4 = (List) objM60216;
                                                                                    if (list4 != null) {
                                                                                        C3639 c3639 = AbstractC5705.f18789;
                                                                                        C3639 c36310 = new C3639();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            C0178.m382();
                                                                                            return;
                                                                                        }
                                                                                        C3639 c36311 = new C3639();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            C0178.m382();
                                                                                            return;
                                                                                        }
                                                                                        i10 = !c36310.equals(c36311) ? 1 : 0;
                                                                                    } else if (!list3.isEmpty()) {
                                                                                        i10 = 1;
                                                                                    }
                                                                                } else if (obj2 instanceof C0078) {
                                                                                    C0078 c0078 = (C0078) obj2;
                                                                                    Object objM60217 = c3263.m6027(c30513);
                                                                                    if (objM60217 == null) {
                                                                                        objM60217 = null;
                                                                                    }
                                                                                    if (c0078 != objM60217) {
                                                                                        if (objM60217 instanceof C0078) {
                                                                                            String str4 = c0078.f14721;
                                                                                            C0078 c0079 = (C0078) objM60217;
                                                                                            InterfaceC0400 interfaceC0401 = c0079.f14720;
                                                                                            if (AbstractC3831.m6874(str4, c0079.f14721) && (((interfaceC0400 = c0078.f14720) != null || interfaceC0401 == null) && (interfaceC0400 == null || interfaceC0401 != null))) {
                                                                                            }
                                                                                        }
                                                                                        i10 = 1;
                                                                                    }
                                                                                    i10 = 0;
                                                                                } else {
                                                                                    i10 = 1;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            num6 = num9;
                                                            i15 = i33;
                                                            c3263 = c3263;
                                                            num5 = num8;
                                                            i14 = i41;
                                                        }
                                                    }
                                                    i15 = i33;
                                                    num5 = num8;
                                                    arrayList3 = arrayList5;
                                                    i13 = i38;
                                                    c0606 = c0608;
                                                    i14 = i41;
                                                    num6 = num9;
                                                    c3263 = c3263;
                                                } else {
                                                    Object objM60218 = c3263.m6027(c30513);
                                                    if (objM60218 == null) {
                                                        objM60218 = null;
                                                    }
                                                    if (AbstractC3831.m6874(obj2, objM60218)) {
                                                        i15 = i33;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i13 = i38;
                                                        c0606 = c0608;
                                                        i14 = i41;
                                                        num6 = num9;
                                                        c3263 = c3263;
                                                    } else {
                                                        c3059 = AbstractC2771.f9216;
                                                        if (AbstractC3831.m6874(c30513, c3059)) {
                                                            str3 = (String) obj2;
                                                            zM6016 = c3263.m6015(c3059);
                                                            i24 = i34;
                                                            if (zM6016) {
                                                                viewOnAttachStateChangeListenerC2392.m4488(i33, i24, str3);
                                                            }
                                                        } else {
                                                            i16 = i34;
                                                            if (AbstractC3831.m6874(c30513, AbstractC2771.f9210)) {
                                                                m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num8, i16);
                                                                m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, i16);
                                                            } else if (AbstractC3831.m6874(c30513, AbstractC2771.f9222)) {
                                                                m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, 8192, 8);
                                                                m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, 8);
                                                            } else if (AbstractC3831.m6874(c30513, AbstractC2771.f9195)) {
                                                                m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, 3072, 8);
                                                            } else if (AbstractC3831.m6874(c30513, AbstractC2771.f9197)) {
                                                                m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num8, 8);
                                                                m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, 8);
                                                            } else {
                                                                c30510 = AbstractC2771.f9218;
                                                                arrayList3 = arrayList5;
                                                                if (AbstractC3831.m6874(c30513, c30510)) {
                                                                    objM60212 = c3264.m6027(AbstractC2771.f9196);
                                                                    if (objM60212 == null) {
                                                                        objM60212 = null;
                                                                    }
                                                                    c2155 = (C2155) objM60212;
                                                                    if (c2155 == null) {
                                                                        i13 = i38;
                                                                        c0606 = c0608;
                                                                        m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num8, 8);
                                                                        m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, 8);
                                                                    } else {
                                                                        objM60213 = c3264.m6027(c30510);
                                                                        if (objM60213 == null) {
                                                                            objM60213 = null;
                                                                        }
                                                                        if (AbstractC3831.m6874(objM60213, Boolean.TRUE)) {
                                                                            accessibilityEventM4503 = viewOnAttachStateChangeListenerC2392.m4503(viewOnAttachStateChangeListenerC2392.m4511(i33), 4);
                                                                            C3129 c31213 = c3129;
                                                                            c0606 = c0608;
                                                                            C3129 c31214 = new C3129(c31213.f10475, true, c0606, c2545);
                                                                            objM60214 = c31214.m5769().f8490.m6027(AbstractC2771.f9213);
                                                                            if (objM60214 == null) {
                                                                                objM60214 = null;
                                                                            }
                                                                            List list5 = (List) objM60214;
                                                                            c3129 = c31213;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objM60215 = c31214.m5769().f8490.m6027(AbstractC2771.f9198);
                                                                            if (objM60215 == null) {
                                                                                objM60215 = null;
                                                                            }
                                                                            list = (List) objM60215;
                                                                            i13 = i38;
                                                                            if (list != null) {
                                                                                strM1758 = AbstractC0844.m1757(list, ",", null, 62);
                                                                            } else {
                                                                                strM1758 = null;
                                                                            }
                                                                            if (strM1757 != null) {
                                                                                accessibilityEventM4503.setContentDescription(strM1757);
                                                                            }
                                                                            if (strM1758 != null) {
                                                                                accessibilityEventM4503.getText().add(strM1758);
                                                                            }
                                                                            viewOnAttachStateChangeListenerC2392.m4504(accessibilityEventM4503);
                                                                        } else {
                                                                            i13 = i38;
                                                                            c0606 = c0608;
                                                                            m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, num9, 8);
                                                                        }
                                                                    }
                                                                } else {
                                                                    i13 = i38;
                                                                    c0606 = c0608;
                                                                    if (AbstractC3831.m6874(c30513, AbstractC2771.f9213)) {
                                                                        viewOnAttachStateChangeListenerC2392.m4495(viewOnAttachStateChangeListenerC2392.m4511(i33), 2048, 4, (List) obj2);
                                                                    } else {
                                                                        c30511 = AbstractC2771.f9219;
                                                                        str = "";
                                                                        if (AbstractC3831.m6874(c30513, c30511)) {
                                                                            if (c3264.m6015(AbstractC0208.f783)) {
                                                                                objM60210 = c3263.m6027(c30511);
                                                                                if (objM60210 == null) {
                                                                                    objM60210 = null;
                                                                                }
                                                                                c12410 = (C1249) objM60210;
                                                                                if (c12410 == null) {
                                                                                    c12410 = "";
                                                                                }
                                                                                objM60211 = c3264.m6027(c30511);
                                                                                if (objM60211 == null) {
                                                                                    objM60211 = null;
                                                                                }
                                                                                charSequence = (C1249) objM60211;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceM4485 = m4485(charSequence);
                                                                                length = c12410.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i19 = length2;
                                                                                } else {
                                                                                    i19 = length;
                                                                                }
                                                                                num7 = num9;
                                                                                i20 = 0;
                                                                                while (true) {
                                                                                    num5 = num8;
                                                                                    if (i20 < i19) {
                                                                                        i21 = length;
                                                                                        break;
                                                                                    }
                                                                                    i21 = length;
                                                                                    if (c12410.charAt(i20) != charSequence.charAt(i20)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i20++;
                                                                                        length = i21;
                                                                                        num8 = num5;
                                                                                    }
                                                                                }
                                                                                i22 = 0;
                                                                                while (true) {
                                                                                    if (i22 < i19 - i20) {
                                                                                        i23 = i22;
                                                                                        break;
                                                                                    }
                                                                                    i23 = i22;
                                                                                    if (c12410.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                                int i46 = (i21 - i23) - i20;
                                                                                int i47 = (length2 - i23) - i20;
                                                                                C3059 c30517 = AbstractC2771.f9225;
                                                                                boolean zM6019 = c3263.m6015(c30517);
                                                                                boolean zM60110 = c3264.m6015(c30517);
                                                                                zM6015 = c3263.m6015(AbstractC2771.f9219);
                                                                                if (zM6015) {
                                                                                    z2 = false;
                                                                                } else {
                                                                                    z2 = false;
                                                                                }
                                                                                if (zM6015) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (z2) {
                                                                                    i15 = i33;
                                                                                    num9 = num7;
                                                                                    accessibilityEventM4508 = viewOnAttachStateChangeListenerC2392.m4508(viewOnAttachStateChangeListenerC2392.m4511(i33), num9, num7, Integer.valueOf(length2), charSequenceM4485);
                                                                                } else {
                                                                                    i15 = i33;
                                                                                    num9 = num7;
                                                                                    accessibilityEventM4508 = viewOnAttachStateChangeListenerC2392.m4508(viewOnAttachStateChangeListenerC2392.m4511(i33), num9, num7, Integer.valueOf(length2), charSequenceM4485);
                                                                                }
                                                                                accessibilityEventM4508.setClassName("android.widget.EditText");
                                                                                viewOnAttachStateChangeListenerC2392.m4504(accessibilityEventM4508);
                                                                                if (z2) {
                                                                                    long j7 = ((C3346) c2545.m4771(AbstractC2771.f9217)).f11197;
                                                                                    accessibilityEventM4508.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventM4508.setToIndex((int) (j7 & 4294967295L));
                                                                                    viewOnAttachStateChangeListenerC2392.m4504(accessibilityEventM4508);
                                                                                } else {
                                                                                    long j8 = ((C3346) c2545.m4771(AbstractC2771.f9217)).f11197;
                                                                                    accessibilityEventM4508.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventM4508.setToIndex((int) (j8 & 4294967295L));
                                                                                    viewOnAttachStateChangeListenerC2392.m4504(accessibilityEventM4508);
                                                                                }
                                                                            } else {
                                                                                i15 = i33;
                                                                                c3263 = c3263;
                                                                                num5 = num8;
                                                                                m4479(viewOnAttachStateChangeListenerC2392, viewOnAttachStateChangeListenerC2392.m4511(i15), 2048, Integer.valueOf(i28), 8);
                                                                            }
                                                                            num6 = num9;
                                                                            i14 = i41;
                                                                        } else {
                                                                            i15 = i33;
                                                                            c3263 = c3263;
                                                                            num5 = num8;
                                                                            i14 = i41;
                                                                            c30512 = AbstractC2771.f9217;
                                                                            if (AbstractC3831.m6874(c30513, c30512)) {
                                                                                objM6029 = c3264.m6027(c30511);
                                                                                if (objM6029 == null) {
                                                                                    objM6029 = null;
                                                                                }
                                                                                c1249 = (C1249) objM6029;
                                                                                if (c1249 != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((C3346) c2545.m4771(c30512)).f11197;
                                                                                num6 = num9;
                                                                                viewOnAttachStateChangeListenerC2392 = this;
                                                                                viewOnAttachStateChangeListenerC2392.m4504(viewOnAttachStateChangeListenerC2392.m4508(viewOnAttachStateChangeListenerC2392.m4511(i15), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), m4485(str)));
                                                                                viewOnAttachStateChangeListenerC2392.m4499(i35);
                                                                            } else {
                                                                                num6 = num9;
                                                                                if (AbstractC3831.m6874(c30513, c30514)) {
                                                                                    viewOnAttachStateChangeListenerC2392.m4493(c0606);
                                                                                    size = arrayList4.size();
                                                                                    i17 = 0;
                                                                                    while (true) {
                                                                                        if (i17 >= size) {
                                                                                            c0968 = null;
                                                                                            break;
                                                                                        } else {
                                                                                            if (((C0967) arrayList4.get(i17)).f3417 == i15) {
                                                                                                c0968 = (C0967) arrayList4.get(i17);
                                                                                                break;
                                                                                            }
                                                                                            i17++;
                                                                                        }
                                                                                    }
                                                                                    objM6027 = c3264.m6027(c30514);
                                                                                    if (objM6027 == null) {
                                                                                        objM6027 = null;
                                                                                    }
                                                                                    c0968.f3412 = (C4323) objM6027;
                                                                                    objM6028 = c3264.m6027(AbstractC2771.f9209);
                                                                                    if (objM6028 == null) {
                                                                                        objM6028 = null;
                                                                                    }
                                                                                    c0968.f3415 = (C4323) objM6028;
                                                                                    if (c0968.f3416.contains(c0968)) {
                                                                                        viewOnAttachStateChangeListenerC2392.f7934.getSnapshotObserver().f5926.m9077(c0968, viewOnAttachStateChangeListenerC2392.f7949, new C5304(1, c0968, viewOnAttachStateChangeListenerC2392));
                                                                                    }
                                                                                } else {
                                                                                    viewOnAttachStateChangeListenerC2392.m4493(c0606);
                                                                                    size = arrayList4.size();
                                                                                    i17 = 0;
                                                                                    while (true) {
                                                                                        if (i17 >= size) {
                                                                                            c0968 = null;
                                                                                            break;
                                                                                        } else {
                                                                                            if (((C0967) arrayList4.get(i17)).f3417 == i15) {
                                                                                                c0968 = (C0967) arrayList4.get(i17);
                                                                                                break;
                                                                                            }
                                                                                            i17++;
                                                                                        }
                                                                                    }
                                                                                    objM6027 = c3264.m6027(c30514);
                                                                                    if (objM6027 == null) {
                                                                                        objM6027 = null;
                                                                                    }
                                                                                    c0968.f3412 = (C4323) objM6027;
                                                                                    objM6028 = c3264.m6027(AbstractC2771.f9209);
                                                                                    if (objM6028 == null) {
                                                                                        objM6028 = null;
                                                                                    }
                                                                                    c0968.f3415 = (C4323) objM6028;
                                                                                    if (c0968.f3416.contains(c0968)) {
                                                                                        viewOnAttachStateChangeListenerC2392.f7934.getSnapshotObserver().f5926.m9077(c0968, viewOnAttachStateChangeListenerC2392.f7949, new C5304(1, c0968, viewOnAttachStateChangeListenerC2392));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                num6 = num9;
                                                                i15 = i33;
                                                                c3263 = c3263;
                                                                num5 = num8;
                                                                i14 = i41;
                                                            }
                                                        }
                                                        i15 = i33;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i13 = i38;
                                                        c0606 = c0608;
                                                        i14 = i41;
                                                        num6 = num9;
                                                        c3263 = c3263;
                                                    }
                                                }
                                            } else {
                                                c2543 = c2544;
                                                num5 = num8;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i13 = i38;
                                                i39 = i39;
                                                c0606 = c0608;
                                                i14 = length4;
                                                num6 = num9;
                                                i15 = i33;
                                                c3263 = c3263;
                                            }
                                            i34 = 8;
                                            i33 = i15;
                                            c0608 = c0606;
                                            c2544 = c2543;
                                            j4 = j >> 8;
                                            i39++;
                                            length4 = i14;
                                            num9 = num6;
                                            c3263 = c3263;
                                            i38 = i13;
                                            arrayList5 = arrayList3;
                                            num8 = num5;
                                        }
                                        i9 = i33;
                                        c2542 = c2544;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        c0605 = c0608;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num9;
                                        int i48 = i38;
                                        c3262 = c3263;
                                        if (i48 != i34) {
                                            break;
                                        }
                                    } else {
                                        i9 = i33;
                                        c2542 = c2544;
                                        c3262 = c3263;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        c0605 = c0608;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num9;
                                    }
                                    if (i37 == i12) {
                                        break;
                                    }
                                    num9 = num4;
                                    i33 = i9;
                                    c3263 = c3262;
                                    c0608 = c0605;
                                    c31210 = c3129;
                                    c2544 = c2542;
                                    arrayList5 = arrayList2;
                                    i34 = 8;
                                    i36 = i37 + 1;
                                    length4 = i12;
                                    num8 = num3;
                                }
                            } else {
                                c2542 = c2544;
                                num3 = num8;
                                arrayList2 = arrayList5;
                                i4 = i31;
                                c3129 = c31210;
                                i8 = 1;
                                num4 = num9;
                                i9 = i33;
                                i5 = 0;
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                Iterator it = c2542.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i5;
                                        break;
                                    }
                                    if (!c3129.m5769().f8490.m6015((C3059) ((Map.Entry) it.next()).getKey())) {
                                        i11 = i8;
                                        break;
                                    }
                                }
                                i10 = i11;
                            }
                            if (i10 != 0) {
                                int iM4511 = viewOnAttachStateChangeListenerC2392.m4511(i9);
                                i7 = 8;
                                m4479(viewOnAttachStateChangeListenerC2392, iM4511, 2048, num4, 8);
                            } else {
                                i7 = 8;
                            }
                        }
                    } else {
                        i3 = i32;
                        num3 = num8;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i31;
                        i5 = i26;
                        i6 = i27;
                        num4 = num9;
                        i7 = i30;
                    }
                    j3 >>= i7;
                    i32 = i3 + 1;
                    abstractC5747 = abstractC5746;
                    i26 = i5;
                    num9 = num4;
                    i30 = i7;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i27 = i6;
                    i31 = i4;
                    arrayList5 = arrayList2;
                    num8 = num3;
                }
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                int i49 = i27;
                num2 = num9;
                if (i31 != i30) {
                    return;
                } else {
                    i2 = i49;
                }
            } else {
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                num2 = num9;
                i2 = i27;
            }
            if (i2 == i29) {
                return;
            }
            i27 = i2 + 1;
            abstractC5747 = abstractC5746;
            length3 = i29;
            i26 = i;
            num9 = num2;
            i25 = i28;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num8 = num;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥُ */
    public final void m4490(int i, C5817 c5817, String str, Bundle bundle) {
        C3129 c3129;
        C2793 c2793;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850;
        RectF rectF;
        C2793 c2793M5317;
        AccessibilityNodeInfo accessibilityNodeInfo = c5817.f19154;
        C1307 c1307 = (C1307) m4510().m9571(i);
        if (c1307 == null || (c3129 = c1307.f4492) == null) {
            return;
        }
        C0605 c0605 = c3129.f10471;
        C2542 c2542 = c3129.f10476;
        C3262 c3262 = c2542.f8490;
        String strM4487 = m4487(c3129);
        if (AbstractC3831.m6874(str, this.f7945)) {
            int iM8891 = this.f7937.m8891(i);
            if (iM8891 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM8891);
                return;
            }
            return;
        }
        if (AbstractC3831.m6874(str, this.f7950)) {
            int iM8892 = this.f7939.m8891(i);
            if (iM8892 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM8892);
                return;
            }
            return;
        }
        boolean zM6015 = c3262.m6015(AbstractC0208.f774);
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851 = this.f7934;
        AbstractC1311 abstractC1311 = null;
        if (zM6015 && bundle != null && AbstractC3831.m6874(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strM4487 != null ? strM4487.length() : Integer.MAX_VALUE)) {
                    C3828 c3828M7037 = AbstractC3925.m7037(c2542);
                    if (c3828M7037 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = i2 + i4;
                        if (i5 >= c3828M7037.f12697.f8430.f4307.length()) {
                            arrayList.add(abstractC1311);
                            i2 = i2;
                            i3 = i3;
                            viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                        } else {
                            C2793 c2793M6826 = c3828M7037.m6826(i5);
                            AbstractC1311 abstractC1311M5765 = c3129.m5765();
                            long jMo2808 = 0;
                            if (abstractC1311M5765 != null) {
                                if (!abstractC1311M5765.mo2787().f17786) {
                                    abstractC1311M5765 = abstractC1311;
                                }
                                if (abstractC1311M5765 != null) {
                                    jMo2808 = abstractC1311M5765.mo2808(0L);
                                }
                            }
                            C2793 c2793M5323 = c2793M6826.m5323(jMo2808);
                            C2793 c2793M5770 = c3129.m5770();
                            if (c2793M5323.m5324(c2793M5770)) {
                                c2793M5317 = c2793M5323.m5317(c2793M5770);
                            } else {
                                c2793 = abstractC1311;
                            }
                            if (c2793 != 0) {
                                c2793 = c2793M5317;
                                long jM1798 = viewTreeObserverOnGlobalLayoutListenerC0851.m1798((((long) Float.floatToRawIntBits(c2793.f9342)) & 4294967295L) | (((long) Float.floatToRawIntBits(c2793.f9343)) << 32));
                                viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                                long jM1799 = viewTreeObserverOnGlobalLayoutListenerC0850.m1798((((long) Float.floatToRawIntBits(c2793.f9344)) & 4294967295L) | (((long) Float.floatToRawIntBits(c2793.f9341)) << 32));
                                int i6 = (int) (jM1798 >> 32);
                                int i7 = (int) (jM1799 >> 32);
                                int i8 = (int) (jM1798 & 4294967295L);
                                int i9 = (int) (jM1799 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                            } else {
                                c2793 = c2793M5317;
                                viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                        i3 = i3;
                        viewTreeObserverOnGlobalLayoutListenerC0851 = viewTreeObserverOnGlobalLayoutListenerC0850;
                        i2 = i2;
                        abstractC1311 = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        C3059 c3059 = AbstractC2771.f9194;
        if (c3262.m6015(c3059) && bundle != null && AbstractC3831.m6874(str, "androidx.compose.ui.semantics.testTag")) {
            Object objM6027 = c3262.m6027(c3059);
            String str2 = (String) (objM6027 == null ? null : objM6027);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC3831.m6874(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c3129.f10473);
            return;
        }
        if (AbstractC3831.m6874(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objM6028 = c3262.m6027(AbstractC2771.f9208);
            InterfaceC2864 interfaceC2864 = (InterfaceC2864) (objM6028 == null ? null : objM6028);
            if (interfaceC2864 != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                C2793 c2793M4512 = m4512(c3129, rect, interfaceC2864);
                float f = c2793M4512.f9342;
                float f2 = c2793M4512.f9343;
                AbstractC3925 abstractC3925Mo1709 = interfaceC2864.mo1709(c2793M4512.m5316(), c0605.f2272, viewTreeObserverOnGlobalLayoutListenerC0851.getDensity());
                if (abstractC3925Mo1709 instanceof C2490) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m4484(abstractC3925Mo1709, f2, f));
                    return;
                } else if (abstractC3925Mo1709 instanceof C4996) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m4484(abstractC3925Mo1709, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m4482(abstractC3925Mo1709));
                    return;
                } else if (!(abstractC3925Mo1709 instanceof C0889)) {
                    C1078.m2275();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m4483(abstractC3925Mo1709, f2, f));
                    return;
                }
            }
            return;
        }
        if (AbstractC3831.m6874(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objM6029 = c3262.m6027(AbstractC2771.f9208);
            InterfaceC2864 interfaceC2865 = (InterfaceC2864) (objM6029 == null ? null : objM6029);
            if (interfaceC2865 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                C2793 c2793M4513 = m4512(c3129, rect2, interfaceC2865);
                Rect rectM4484 = m4484(interfaceC2865.mo1709(c2793M4513.m5316(), c0605.f2272, viewTreeObserverOnGlobalLayoutListenerC0851.getDensity()), c2793M4513.f9343, c2793M4513.f9342);
                if (rectM4484 != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM4484);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC3831.m6874(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objM60210 = c3262.m6027(AbstractC2771.f9208);
            InterfaceC2864 interfaceC2866 = (InterfaceC2864) (objM60210 == null ? null : objM60210);
            if (interfaceC2866 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrM4482 = m4482(interfaceC2866.mo1709(m4512(c3129, rect3, interfaceC2866).m5316(), c0605.f2272, viewTreeObserverOnGlobalLayoutListenerC0851.getDensity()));
                if (fArrM4482 != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM4482);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC3831.m6874(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objM60211 = c3262.m6027(AbstractC2771.f9208);
            InterfaceC2864 interfaceC2867 = (InterfaceC2864) (objM60211 == null ? null : objM60211);
            if (interfaceC2867 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                C2793 c2793M4514 = m4512(c3129, rect4, interfaceC2867);
                Region regionM4483 = m4483(interfaceC2867.mo1709(c2793M4514.m5316(), c0605.f2272, viewTreeObserverOnGlobalLayoutListenerC0851.getDensity()), c2793M4514.f9343, c2793M4514.f9342);
                if (regionM4483 != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM4483);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final Rect m4491(C1307 c1307) {
        C4730 c4730 = c1307.f4491;
        return m4500(c4730.f15612, c4730.f15611, c4730.f15610, c4730.f15613);
    }

    /* JADX INFO: renamed from: ۥْ */
    public final boolean m4492() {
        AccessibilityManager accessibilityManager = this.f7957;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f7941;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f7941 = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m4493(C0605 c0605) {
        if (this.f7952.add(c0605)) {
            this.f7954.mo5597(C2358.f7817);
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m4494(C0605 c0605) {
        if (c0605.m1348() && !this.f7934.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c0605)) {
            int i = c0605.f2273;
            C4323 c4323 = (C4323) this.f7958.m9571(i);
            C4323 c4324 = (C4323) this.f7935.m9571(i);
            if (c4323 == null && c4324 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM4503 = m4503(i, 4096);
            if (c4323 != null) {
                accessibilityEventM4503.setScrollX((int) ((Number) c4323.f14290.mo449()).floatValue());
                accessibilityEventM4503.setMaxScrollX((int) ((Number) c4323.f14289.mo449()).floatValue());
            }
            if (c4324 != null) {
                accessibilityEventM4503.setScrollY((int) ((Number) c4324.f14290.mo449()).floatValue());
                accessibilityEventM4503.setMaxScrollY((int) ((Number) c4324.f14289.mo449()).floatValue());
            }
            m4504(accessibilityEventM4503);
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final boolean m4495(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m4492()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM4503 = m4503(i, i2);
        if (num != null) {
            accessibilityEventM4503.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM4503.setContentDescription(AbstractC0844.m1757(list, ",", null, 62));
        }
        return m4504(accessibilityEventM4503);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۖ */
    public final void m4496(C3129 c3129, C1900 c1900) {
        int[] iArr = AbstractC5291.f17428;
        C0482 c0482 = new C0482();
        List listM5756 = C3129.m5756(4, c3129);
        C0605 c0605 = c3129.f10471;
        int size = listM5756.size();
        for (int i = 0; i < size; i++) {
            C3129 c31210 = (C3129) listM5756.get(i);
            AbstractC5746 abstractC5746M4510 = m4510();
            int i2 = c31210.f10473;
            if (abstractC5746M4510.m9572(i2)) {
                if (!c1900.f6281.m1028(i2)) {
                    m4493(c0605);
                    return;
                }
                c0482.m1032(i2);
            }
        }
        C0482 c0483 = c1900.f6281;
        int[] iArr2 = c0483.f1750;
        long[] jArr = c0483.f1751;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !c0482.m1028(iArr2[(i3 << 3) + i5])) {
                            m4493(c0605);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listM5757 = C3129.m5756(4, c3129);
        int size2 = listM5757.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C3129 c31211 = (C3129) listM5757.get(i6);
            C1900 c1901 = (C1900) this.f7943.m9571(c31211.f10473);
            if (c1901 != null && m4510().m9572(c31211.f10473)) {
                m4496(c31211, c1901);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final boolean m4497(C3129 c3129, int i, int i2, boolean z) {
        String strM4487;
        C2542 c2542 = c3129.f10476;
        int i3 = c3129.f10473;
        C3059 c3059 = AbstractC0208.f779;
        if (c2542.f8490.m6015(c3059) && AbstractC1605.m3367(c3129)) {
            InterfaceC2609 interfaceC2609 = (InterfaceC2609) ((C0078) c3129.f10476.m4771(c3059)).f14720;
            if (interfaceC2609 != null) {
                return ((Boolean) interfaceC2609.mo1173(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f7951) && (strM4487 = m4487(c3129)) != null) {
            if (i < 0 || i != i2 || i2 > strM4487.length()) {
                i = -1;
            }
            this.f7951 = i;
            boolean z2 = strM4487.length() > 0;
            m4504(m4508(m4511(i3), z2 ? Integer.valueOf(this.f7951) : null, z2 ? Integer.valueOf(this.f7951) : null, z2 ? Integer.valueOf(strM4487.length()) : null, strM4487));
            m4499(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m4498(int i, long j, boolean z) {
        C3059 c3059;
        int i2;
        if (AbstractC3831.m6874(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC5746 abstractC5746M4510 = m4510();
            if (!C1553.m3306(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    c3059 = AbstractC2771.f9209;
                } else {
                    if (z) {
                        C1078.m2275();
                        return false;
                    }
                    c3059 = AbstractC2771.f9232;
                }
                Object[] objArr = abstractC5746M4510.f18945;
                long[] jArr = abstractC5746M4510.f18948;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    C1307 c1307 = (C1307) objArr[(i3 << 3) + i6];
                                    C4730 c4730 = c1307.f4491;
                                    float f = c4730.f15612;
                                    i2 = i4;
                                    float f2 = c4730.f15611;
                                    float f3 = c4730.f15610;
                                    float f4 = c4730.f15613;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objM6027 = c1307.f4492.f10476.f8490.m6027(c3059);
                                        if (objM6027 == null) {
                                            objM6027 = null;
                                        }
                                        C4323 c4323 = (C4323) objM6027;
                                        if (c4323 != null) {
                                            InterfaceC4448 interfaceC4448 = c4323.f14290;
                                            if (i < 0) {
                                                if (((Number) interfaceC4448.mo449()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) interfaceC4448.mo449()).floatValue() < ((Number) c4323.f14289.mo449()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.C0004
    /* JADX INFO: renamed from: ۥۣ */
    public final C4228 mo490(View view) {
        return this.f7955;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m4499(int i) {
        C0319 c0319 = this.f7928;
        if (c0319 != null) {
            C3129 c3129 = c0319.f1174;
            if (i != c3129.f10473) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0319.f1172 <= 1000) {
                AccessibilityEvent accessibilityEventM4503 = m4503(m4511(c3129.f10473), 131072);
                accessibilityEventM4503.setFromIndex(c0319.f1175);
                accessibilityEventM4503.setToIndex(c0319.f1171);
                accessibilityEventM4503.setAction(c0319.f1173);
                accessibilityEventM4503.setMovementGranularity(c0319.f1170);
                accessibilityEventM4503.getText().add(m4487(c3129));
                m4504(accessibilityEventM4503);
            }
        }
        this.f7928 = null;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final Rect m4500(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f7934;
        long jM1798 = viewTreeObserverOnGlobalLayoutListenerC0850.m1798(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jM1799 = viewTreeObserverOnGlobalLayoutListenerC0850.m1798((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jM1798 >> 32);
        int i2 = (int) (jM1799 >> 32);
        int i3 = (int) (jM1798 & 4294967295L);
        int i4 = (int) (jM1799 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final int m4501(C3129 c3129) {
        C2542 c2542 = c3129.f10476;
        if (!c2542.f8490.m6015(AbstractC2771.f9213)) {
            C3059 c3059 = AbstractC2771.f9217;
            if (c2542.f8490.m6015(c3059)) {
                return (int) (((C3346) c2542.m4771(c3059)).f11197 & 4294967295L);
            }
        }
        return this.f7951;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final int m4502(C3129 c3129) {
        C2542 c2542 = c3129.f10476;
        if (!c2542.f8490.m6015(AbstractC2771.f9213)) {
            C3059 c3059 = AbstractC2771.f9217;
            if (c2542.f8490.m6015(c3059)) {
                return (int) (((C3346) c2542.m4771(c3059)).f11197 >> 32);
            }
        }
        return this.f7951;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final AccessibilityEvent m4503(int i, int i2) {
        C1307 c1307;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f7934;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0850.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0850, i);
        if (m4492() && (c1307 = (C1307) m4510().m9571(i)) != null) {
            C3129 c3129 = c1307.f4492;
            accessibilityEventObtain.setPassword(c3129.f10476.f8490.m6015(AbstractC2771.f9225));
            Object objM6027 = c3129.f10476.f8490.m6027(AbstractC2771.f9236);
            if (objM6027 == null) {
                objM6027 = null;
            }
            boolean zM6874 = AbstractC3831.m6874(objM6027, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0002.m178(accessibilityEventObtain, zM6874);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m4504(AccessibilityEvent accessibilityEvent) {
        if (!m4492()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f7932 = true;
        }
        try {
            return ((Boolean) this.f7936.mo211(accessibilityEvent)).booleanValue();
        } finally {
            this.f7932 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦٖ */
    public final void m4505() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        C1900 c1900;
        C0482 c0482 = new C0482();
        C0482 c0483 = this.f7961;
        int[] iArr = c0483.f1750;
        long[] jArr3 = c0483.f1751;
        int length = jArr3.length - 2;
        C4912 c4912 = this.f7943;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            C1307 c1307 = (C1307) m4510().m9571(i6);
                            Object obj = null;
                            C3129 c3129 = c1307 != null ? c1307.f4492 : null;
                            if (c3129 != null) {
                                if (!c3129.f10476.f8490.m6015(AbstractC2771.f9216)) {
                                    c0482.m1032(i6);
                                    c1900 = (C1900) c4912.m9571(i6);
                                    if (c1900 != null) {
                                        Object objM6027 = c1900.f6282.f8490.m6027(AbstractC2771.f9216);
                                        obj = (String) (objM6027 != null ? objM6027 : null);
                                    }
                                    m4488(i6, 32, obj);
                                }
                            } else {
                                c0482.m1032(i6);
                                c1900 = (C1900) c4912.m9571(i6);
                                if (c1900 != null) {
                                    Object objM6028 = c1900.f6282.f8490.m6027(AbstractC2771.f9216);
                                    obj = (String) (objM6028 != null ? objM6028 : null);
                                }
                                m4488(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = c0482.f1750;
        long[] jArr4 = c0482.f1751;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = c0483.f1748;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = c0483.f1751;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (c0483.f1750[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                c0483.m1034(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        c4912.m8314();
        AbstractC5746 abstractC5746M4510 = m4510();
        int[] iArr3 = abstractC5746M4510.f18947;
        Object[] objArr = abstractC5746M4510.f18945;
        long[] jArr6 = abstractC5746M4510.f18948;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            C3129 c31210 = ((C1307) objArr[i25]).f4492;
                            C2542 c2542 = c31210.f10476;
                            C3059 c3059 = AbstractC2771.f9216;
                            if (c2542.f8490.m6015(c3059) && c0483.m1032(i26)) {
                                m4488(i26, 16, (String) c31210.f10476.m4771(c3059));
                            }
                            c4912.m8319(i26, new C1900(c31210, m4510()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.f7931 = new C1900(this.f7934.getSemanticsOwner().m9199(), m4510());
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m4506(C0605 c0605, C0482 c0482) {
        C2542 c2542M1331;
        if (c0605.m1348() && !this.f7934.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c0605)) {
            C0605 c0606 = null;
            if (!c0605.f2256.m4585(8)) {
                c0605 = c0605.m1356();
                while (true) {
                    if (c0605 == null) {
                        c0605 = null;
                        break;
                    } else if (c0605.f2256.m4585(8)) {
                        break;
                    } else {
                        c0605 = c0605.m1356();
                    }
                }
            }
            if (c0605 == null || (c2542M1331 = c0605.m1331()) == null) {
                return;
            }
            if (!c2542M1331.f8487) {
                for (C0605 c0605M1356 = c0605.m1356(); c0605M1356 != null; c0605M1356 = c0605M1356.m1356()) {
                    C2542 c2542M1332 = c0605M1356.m1331();
                    if (c2542M1332 != null && c2542M1332.f8487) {
                        c0606 = c0605M1356;
                        break;
                    }
                }
                if (c0606 != null) {
                    c0605 = c0606;
                }
            }
            int i = c0605.f2273;
            if (c0482.m1032(i)) {
                m4479(this, m4511(i), 2048, 1, 8);
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m4507() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m4492()) {
                m4496(this.f7934.getSemanticsOwner().m9199(), this.f7931);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m4489(m4510());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m4505();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final AccessibilityEvent m4508(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM4503 = m4503(i, 8192);
        if (num != null) {
            accessibilityEventM4503.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM4503.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM4503.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM4503.getText().add(charSequence);
        }
        return accessibilityEventM4503;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[Catch: all -> 0x0032, LOOP:0: B:33:0x007b->B:34:0x007d, LOOP_END, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (p000.AbstractC2765.m5130(r7, r0) == r5) goto L41;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00bb -> B:14:0x002f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۦۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m4509(p000.AbstractC0772 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p000.C4024
            if (r0 == 0) goto L13
            r0 = r11
            ۦٍّؔٝ r0 = (p000.C4024) r0
            int r1 = r0.f13423
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13423 = r1
            goto L18
        L13:
            ۦٍّؔٝ r0 = new ۦٍّؔٝ
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f13421
            int r1 = r0.f13423
            r2 = 2
            ۥؘٜؓ٘ r3 = r10.f7952
            r4 = 1
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r1 == 0) goto L44
            if (r1 == r4) goto L3c
            if (r1 != r2) goto L35
            ۥَٝؕٚ r1 = r0.f13419
            ۥؕؖۤۘ r6 = r0.f13420
            p000.AbstractC0186.m409(r11)     // Catch: java.lang.Throwable -> L32
        L2f:
            r11 = r6
            r6 = r1
            goto L56
        L32:
            r10 = move-exception
            goto Lc4
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r10)
            r10 = 0
            return r10
        L3c:
            ۥَٝؕٚ r1 = r0.f13419
            ۥؕؖۤۘ r6 = r0.f13420
            p000.AbstractC0186.m409(r11)     // Catch: java.lang.Throwable -> L32
            goto L67
        L44:
            p000.AbstractC0186.m409(r11)
            ۥؕؖۤۘ r11 = new ۥؕؖۤۘ     // Catch: java.lang.Throwable -> L32
            r11.<init>()     // Catch: java.lang.Throwable -> L32
            ۦۢؗۖؐ r1 = r10.f7954     // Catch: java.lang.Throwable -> L32
            r1.getClass()     // Catch: java.lang.Throwable -> L32
            ۥَٝؕٚ r6 = new ۥَٝؕٚ     // Catch: java.lang.Throwable -> L32
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
        L56:
            r0.f13420 = r11     // Catch: java.lang.Throwable -> L32
            r0.f13419 = r6     // Catch: java.lang.Throwable -> L32
            r0.f13423 = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r6.m3745(r0)     // Catch: java.lang.Throwable -> L32
            if (r1 != r5) goto L63
            goto Lbd
        L63:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L67:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L32
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto Lbe
            r1.m3744()     // Catch: java.lang.Throwable -> L32
            boolean r11 = r10.m4492()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto La2
            int r11 = r3.f6049     // Catch: java.lang.Throwable -> L32
            r7 = 0
        L7b:
            if (r7 >= r11) goto L8c
            java.lang.Object[] r8 = r3.f6050     // Catch: java.lang.Throwable -> L32
            r8 = r8[r7]     // Catch: java.lang.Throwable -> L32
            ۥؗؕؖۧ r8 = (p000.C0605) r8     // Catch: java.lang.Throwable -> L32
            r10.m4506(r8, r6)     // Catch: java.lang.Throwable -> L32
            r10.m4494(r8)     // Catch: java.lang.Throwable -> L32
            int r7 = r7 + 1
            goto L7b
        L8c:
            r6.m1031()     // Catch: java.lang.Throwable -> L32
            ۥًٕؖ r11 = r10.f7934     // Catch: java.lang.Throwable -> L32
            android.os.Handler r11 = r11.getHandler()     // Catch: java.lang.Throwable -> L32
            boolean r7 = r10.f7930     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto La2
            if (r11 == 0) goto La2
            r10.f7930 = r4     // Catch: java.lang.Throwable -> L32
            ۥٛ r7 = r10.f7962     // Catch: java.lang.Throwable -> L32
            r11.post(r7)     // Catch: java.lang.Throwable -> L32
        La2:
            r3.clear()     // Catch: java.lang.Throwable -> L32
            ۦۖؔۛۛ r11 = r10.f7958     // Catch: java.lang.Throwable -> L32
            r11.m8314()     // Catch: java.lang.Throwable -> L32
            ۦۖؔۛۛ r11 = r10.f7935     // Catch: java.lang.Throwable -> L32
            r11.m8314()     // Catch: java.lang.Throwable -> L32
            long r7 = r10.f7959     // Catch: java.lang.Throwable -> L32
            r0.f13420 = r6     // Catch: java.lang.Throwable -> L32
            r0.f13419 = r1     // Catch: java.lang.Throwable -> L32
            r0.f13423 = r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = p000.AbstractC2765.m5130(r7, r0)     // Catch: java.lang.Throwable -> L32
            if (r11 != r5) goto L2f
        Lbd:
            return r5
        Lbe:
            r3.clear()
            ۥۜؑؒؑ r10 = p000.C2358.f7817
            return r10
        Lc4:
            r3.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnAttachStateChangeListenerC2392.m4509(ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final AbstractC5746 m4510() {
        if (this.f7956) {
            this.f7956 = false;
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f7934;
            this.f7960 = AbstractC2776.m5248(viewTreeObserverOnGlobalLayoutListenerC0850.getSemanticsOwner(), C1931.f6363);
            if (m4492()) {
                C4912 c4912 = this.f7960;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC0850.getContext().getResources();
                C5251 c5251 = this.f7937;
                c5251.m8890();
                C5251 c5252 = this.f7939;
                c5252.m8890();
                C1307 c1307 = (C1307) c4912.m9571(-1);
                C3129 c3129 = c1307 != null ? c1307.f4492 : null;
                ArrayList arrayListM9687 = AbstractC5870.m9687(c3129, new C2932(3, c4912), new C2932(4, resources), Collections.singletonList(c3129));
                int iM4181 = AbstractC2164.m4181(arrayListM9687);
                int i = 1;
                if (1 <= iM4181) {
                    while (true) {
                        int i2 = ((C3129) arrayListM9687.get(i - 1)).f10473;
                        int i3 = ((C3129) arrayListM9687.get(i)).f10473;
                        c5251.m8888(i2, i3);
                        c5252.m8888(i3, i2);
                        if (i == iM4181) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f7960;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final int m4511(int i) {
        if (i == this.f7934.getSemanticsOwner().m9199().f10473) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦ۟ */
    public final C2793 m4512(C3129 c3129, Rect rect, InterfaceC2864 interfaceC2864) {
        C2302 c2302 = new C2302(interfaceC2864);
        C0605 c0605 = c3129.f10471;
        AbstractC5381 abstractC5381 = (AbstractC5381) c0605.f2256.f8210;
        InterfaceC3975 interfaceC3975 = null;
        if ((abstractC5381.f17782 & 8) != 0) {
            loop0: while (abstractC5381 != null) {
                if ((abstractC5381.f17781 & 8) == 0) {
                    if ((abstractC5381.f17782 & 8) != 0) {
                        break;
                        break;
                    }
                    abstractC5381 = abstractC5381.f17783;
                } else {
                    AbstractC5381 abstractC5381M9233 = abstractC5381;
                    C0863 c0863 = null;
                    while (abstractC5381M9233 != null) {
                        if (abstractC5381M9233 instanceof InterfaceC5671) {
                            ((InterfaceC5671) abstractC5381M9233).mo790(c2302);
                            if (c2302.f7635) {
                                interfaceC3975 = abstractC5381M9233;
                                break loop0;
                            }
                        } else if ((abstractC5381M9233.f17781 & 8) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                            int i = 0;
                            for (AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
                                if ((abstractC5382.f17781 & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC5381M9233 = abstractC5382;
                                    } else {
                                        if (c0863 == null) {
                                            c0863 = new C0863(new AbstractC5381[16]);
                                        }
                                        if (abstractC5381M9233 != null) {
                                            c0863.m1843(abstractC5381M9233);
                                            abstractC5381M9233 = null;
                                        }
                                        c0863.m1843(abstractC5382);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC5381M9233 = AbstractC5537.m9233(c0863);
                    }
                    if ((abstractC5381.f17782 & 8) != 0) {
                        break;
                    }
                    abstractC5381 = abstractC5381.f17783;
                }
            }
        }
        InterfaceC3975 interfaceC3976 = (InterfaceC5671) interfaceC3975;
        if (interfaceC3976 == null || !((AbstractC5381) interfaceC3976).f17791.f17786) {
            return C4773.m8142((AbstractC1311) c0605.f2256.f8201, false);
        }
        AbstractC1311 abstractC1311M9247 = AbstractC5537.m9247(interfaceC3976);
        C2793 c2793Mo2794 = C4773.m8145(abstractC1311M9247).mo2794(abstractC1311M9247, false);
        Rect rectM4500 = m4500(c2793Mo2794.f9343, c2793Mo2794.f9342, c2793Mo2794.f9341, c2793Mo2794.f9344);
        float f = rectM4500.left - rect.left;
        float f2 = rectM4500.top - rect.top;
        return new C2793(f, f2, rectM4500.width() + f, rectM4500.height() + f2);
    }
}
