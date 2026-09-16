package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥًٕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0850 extends ViewGroup implements InterfaceC2043, InterfaceC4892, InterfaceC3240, InterfaceC3851, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, InterfaceC0280 {

    /* JADX INFO: renamed from: ۥؐۦً, reason: contains not printable characters */
    public static Class f19551;

    /* JADX INFO: renamed from: ۥٔؗۢؐ, reason: contains not printable characters */
    public static Method f19552;

    /* JADX INFO: renamed from: ۥؙۙؒٗ, reason: contains not printable characters */
    public static Method f19553;

    /* JADX INFO: renamed from: ۦۡؔ۟ؓ, reason: contains not printable characters */
    public static final C2730 f19554 = new C2730();

    /* JADX INFO: renamed from: ۦُۣؔۚ, reason: contains not printable characters */
    public static RunnableC4026 f19555;

    /* JADX INFO: renamed from: ۦؘّۨؕ, reason: contains not printable characters */
    public static Method f19556;

    /* JADX INFO: renamed from: ۥ */
    public final C4525 f3054;

    /* JADX INFO: renamed from: ۥؐ */
    public final C1829 f3055;

    /* JADX INFO: renamed from: ۥؑ */
    public final RunnableC3365 f3056;

    /* JADX INFO: renamed from: ۥؒ */
    public boolean f3057;

    /* JADX INFO: renamed from: ۥؓ */
    public final C2016 f3058;

    /* JADX INFO: renamed from: ۥؔ */
    public final C5505 f3059;

    /* JADX INFO: renamed from: ۥؕ */
    public long f3060;

    /* JADX INFO: renamed from: ۥؖ */
    public final View f3061;

    /* JADX INFO: renamed from: ۥؘ */
    public long f3062;

    /* JADX INFO: renamed from: ۥؙ */
    public final C2500 f3063;

    /* JADX INFO: renamed from: ۥؚ */
    public boolean f3064;

    /* JADX INFO: renamed from: ۥً */
    public final ViewOnDragListenerC1501 f3065;

    /* JADX INFO: renamed from: ۥٌ */
    public long f3066;

    /* JADX INFO: renamed from: ۥٍ */
    public final float[] f3067;

    /* JADX INFO: renamed from: ۥٌٍۣؕ, reason: contains not printable characters */
    public final C1113 f19557;

    /* JADX INFO: renamed from: ۥَ */
    public final C2497 f3068;

    /* JADX INFO: renamed from: ۥِ */
    public boolean f3069;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f3070;

    /* JADX INFO: renamed from: ۥٓ */
    public C1040 f3071;

    /* JADX INFO: renamed from: ۥٔ */
    public final C2730 f3072;

    /* JADX INFO: renamed from: ۥٕ */
    public final C4852 f3073;

    /* JADX INFO: renamed from: ۥٖ */
    public InterfaceC4544 f3074;

    /* JADX INFO: renamed from: ۥٗ */
    public final C5704 f3075;

    /* JADX INFO: renamed from: ۥ٘ */
    public final C0915 f3076;

    /* JADX INFO: renamed from: ۥٙ */
    public final C4852 f3077;

    /* JADX INFO: renamed from: ۥٚ */
    public final float[] f3078;

    /* JADX INFO: renamed from: ۥٛ */
    public final C4517 f3079;

    /* JADX INFO: renamed from: ۥٜ */
    public final RunnableC3027 f3080;

    /* JADX INFO: renamed from: ۥٝ */
    public C2730 f3081;

    /* JADX INFO: renamed from: ۥٞ */
    public boolean f3082;

    /* JADX INFO: renamed from: ۥٟ */
    public boolean f3083;

    /* JADX INFO: renamed from: ۥۖ */
    public final C5219 f3084;

    /* JADX INFO: renamed from: ۥۘ */
    public final C0761 f3085;

    /* JADX INFO: renamed from: ۥۙ */
    public final C5704 f3086;

    /* JADX INFO: renamed from: ۥۚ */
    public final C4852 f3087;

    /* JADX INFO: renamed from: ۥۛ */
    public final InterfaceC4367 f3088;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f3089;

    /* JADX INFO: renamed from: ۥ۠ */
    public final AtomicReference f3090;

    /* JADX INFO: renamed from: ۥۡ */
    public final C4752 f3091;

    /* JADX INFO: renamed from: ۥۢ */
    public final C1775 f3092;

    /* JADX INFO: renamed from: ۥۤ */
    public final C5488 f3093;

    /* JADX INFO: renamed from: ۥۥ */
    public final C5704 f3094;

    /* JADX INFO: renamed from: ۥۦ */
    public final RunnableC4868 f3095;

    /* JADX INFO: renamed from: ۥۧ */
    public InterfaceC3534 f3096;

    /* JADX INFO: renamed from: ۥۨ */
    public final C1489 f3097;

    /* JADX INFO: renamed from: ۦ */
    public boolean f3098;

    /* JADX INFO: renamed from: ۦؐ */
    public C1568 f3099;

    /* JADX INFO: renamed from: ۦؒ */
    public final C2730 f3100;

    /* JADX INFO: renamed from: ۦؓ */
    public final int[] f3101;

    /* JADX INFO: renamed from: ۦؔ */
    public final C2471 f3102;

    /* JADX INFO: renamed from: ۦؕ */
    public final C3155 f3103;

    /* JADX INFO: renamed from: ۦؖ */
    public final C1523 f3104;

    /* JADX INFO: renamed from: ۦؗ */
    public final C0605 f3105;

    /* JADX INFO: renamed from: ۦؘ */
    public final C4852 f3106;

    /* JADX INFO: renamed from: ۦؙ */
    public final C3379 f3107;

    /* JADX INFO: renamed from: ۦً */
    public MotionEvent f3108;

    /* JADX INFO: renamed from: ۦٍ */
    public final InterfaceC1922 f3109;

    /* JADX INFO: renamed from: ۦَ */
    public long f3110;

    /* JADX INFO: renamed from: ۦُ */
    public final C4912 f3111;

    /* JADX INFO: renamed from: ۦّ */
    public final InterfaceC0601 f3112;

    /* JADX INFO: renamed from: ۦْ */
    public final C3845 f3113;

    /* JADX INFO: renamed from: ۦٓ */
    public final C0713 f3114;

    /* JADX INFO: renamed from: ۦٔ */
    public InterfaceC4745 f3115;

    /* JADX INFO: renamed from: ۦٕ */
    public final RunnableC3027 f3116;

    /* JADX INFO: renamed from: ۦٖ */
    public final C5461 f3117;

    /* JADX INFO: renamed from: ۦٗ */
    public C4782 f3118;

    /* JADX INFO: renamed from: ۦ٘ */
    public final InterfaceC0611 f3119;

    /* JADX INFO: renamed from: ۦٙ */
    public float f3120;

    /* JADX INFO: renamed from: ۦٚ */
    public final C3194 f3121;

    /* JADX INFO: renamed from: ۦٜ */
    public final C2346 f3122;

    /* JADX INFO: renamed from: ۦٝ */
    public C0399 f3123;

    /* JADX INFO: renamed from: ۦٞ */
    public C3693 f3124;

    /* JADX INFO: renamed from: ۦٟ */
    public final C1377 f3125;

    /* JADX INFO: renamed from: ۦۖ */
    public C3773 f3126;

    /* JADX INFO: renamed from: ۦۘ */
    public boolean f3127;

    /* JADX INFO: renamed from: ۦۛ */
    public InterfaceC5876 f3128;

    /* JADX INFO: renamed from: ۦۜ */
    public final ViewOnAttachStateChangeListenerC2392 f3129;

    /* JADX INFO: renamed from: ۦ۟ */
    public long f3130;

    /* JADX INFO: renamed from: ۦ۠ */
    public final C0193 f3131;

    /* JADX INFO: renamed from: ۦۡ */
    public float f3132;

    /* JADX INFO: renamed from: ۦۢ */
    public boolean f3133;

    /* JADX INFO: renamed from: ۦًۢؖۡ, reason: contains not printable characters */
    public View f19558;

    /* JADX INFO: renamed from: ۦۣ */
    public ViewOnAttachStateChangeListenerC4316 f3134;

    /* JADX INFO: renamed from: ۦۤ */
    public final float[] f3135;

    /* JADX INFO: renamed from: ۦۥ */
    public final C0926 f3136;

    /* JADX INFO: renamed from: ۦۦ */
    public C2240 f3137;

    /* JADX INFO: renamed from: ۦۧ */
    public final C4852 f3138;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4852 f3139;

    public ViewTreeObserverOnGlobalLayoutListenerC0850(Context context, C5686 c5686) {
        EnumC2459 enumC2459;
        super(context);
        this.f3139 = AbstractC2774.m5183(c5686);
        this.f3130 = 9205357640488583168L;
        int i = 1;
        this.f3070 = true;
        this.f3068 = c5686.f18695;
        this.f3128 = C1298.f4455;
        this.f3084 = new C5219();
        int i2 = 0;
        this.f3116 = new RunnableC3027(this, i2);
        this.f3077 = new C4852(AbstractC4009.m7168(context), C1397.f4792);
        this.f3058 = new C2016(this, this);
        this.f3096 = c5686.f18698.mo1009();
        this.f3065 = new ViewOnDragListenerC1501();
        this.f3121 = new C3194();
        this.f3073 = AbstractC2774.m5183(Boolean.FALSE);
        this.f3086 = AbstractC3004.m5600(new C3155(this, i2));
        this.f3107 = c5686.f18696;
        this.f3104 = c5686.f18694;
        this.f3095 = new RunnableC4868();
        int i3 = 3;
        C0605 c0605 = new C0605(3);
        c0605.m1322(C4674.f15397);
        c0605.m1341(getDensity());
        c0605.m1347(getViewConfiguration());
        c0605.m1333(new C0825(this).mo1571(((C2016) getFocusOwner()).f6638).mo1571(m9770getDragAndDropManager().f5104));
        this.f3105 = c0605;
        C4912 c4912 = AbstractC0137.f547;
        this.f3111 = new C4912();
        m9771getLayoutNodes();
        this.f3117 = new C5461(this);
        this.f3059 = new C5505(getRoot(), new C4805(), m9771getLayoutNodes());
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = new ViewOnAttachStateChangeListenerC2392(this);
        this.f3129 = viewOnAttachStateChangeListenerC2392;
        this.f3134 = new ViewOnAttachStateChangeListenerC4316(this, new C3548(0, this, C4773.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        this.f3076 = c5686.f18704;
        this.f3079 = new C4517(this);
        this.f3093 = new C5488();
        this.f3100 = new C2730();
        this.f3063 = new C2500();
        C0605 root = getRoot();
        C4752 c4752 = new C4752();
        c4752.f15686 = root;
        c4752.f15684 = new C3622((C2935) root.f2256.f8206);
        c4752.f15688 = new C3121(13, (byte) 0);
        c4752.f15685 = new C0679();
        this.f3091 = c4752;
        this.f3138 = AbstractC2774.m5183(new Configuration(context.getResources().getConfiguration()));
        this.f3094 = AbstractC3004.m5600(new C3155(this, i));
        this.f3097 = new C1489(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw AbstractC3761.m6633("Autofill service could not be located.");
        }
        this.f3131 = new C0193(new C3121(12, autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f3085 = c5686.f18702;
        this.f3102 = c5686.f18703;
        this.f3092 = new C1775(new C1264(this, i));
        this.f3125 = new C1377(getRoot());
        this.f3060 = 9223372034707292159L;
        this.f3101 = new int[]{0, 0};
        float[] fArrM293 = C0132.m293();
        this.f3067 = fArrM293;
        this.f3078 = C0132.m293();
        this.f3135 = C0132.m293();
        this.f3110 = -1L;
        this.f3066 = 9187343241974906880L;
        this.f3087 = AbstractC2774.m5183(null);
        this.f3075 = AbstractC3004.m5600(new C3155(this, i3));
        this.f3090 = new AtomicReference(null);
        this.f3112 = c5686.f18709;
        this.f3088 = c5686.f18712;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = AbstractC2840.f9486;
        EnumC2459 enumC24510 = EnumC2459.f8215;
        if (layoutDirection != 0) {
            enumC2459 = layoutDirection != 1 ? null : EnumC2459.f8214;
        } else {
            enumC2459 = enumC24510;
        }
        this.f3106 = AbstractC2774.m5183(enumC2459 != null ? enumC2459 : enumC24510);
        this.f3109 = c5686.f18711;
        int i4 = 2;
        this.f3113 = new C3845(isInTouchMode() ? 1 : 2);
        C4525 c4525 = new C4525();
        new C0863(new C5203[16]);
        new C0863(new AbstractC0949[16]);
        new C0863(new C0605[16]);
        new C0863(new AbstractC0949[16]);
        this.f3054 = c4525;
        C0713 c0713 = new C0713();
        new C4575(new C5285(i, c0713));
        this.f3114 = c0713;
        this.f3122 = new C2346(15);
        this.f3072 = new C2730();
        this.f3056 = new RunnableC3365(i2, this);
        this.f3080 = new RunnableC3027(this, i);
        this.f3055 = new C1829(context, new C1264(this, i2));
        this.f3103 = new C3155(this, i4);
        int i5 = Build.VERSION.SDK_INT;
        this.f3119 = i5 < 29 ? new C4787(fArrM293) : new C2901();
        addOnAttachStateChangeListener(this.f3134);
        setWillNotDraw(false);
        setFocusable(true);
        C2473.f8249.m4635(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC3608.m6434(this, viewOnAttachStateChangeListenerC2392);
        setOnDragListener(m9770getDragAndDropManager());
        getRoot().m1332(this);
        if (i5 >= 29) {
            C2322.f7682.m4366(this);
        }
        if (m1770()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f3061 = view;
            addView(view, -1);
        }
        this.f3136 = i5 >= 31 ? new C0926() : null;
        this.f19557 = new C1113(this);
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f3086.getValue()).booleanValue();
    }

    private final C2240 getLegacyTextInputServiceAndroid() {
        C2240 c2240 = this.f3137;
        if (c2240 != null) {
            return c2240;
        }
        C2240 c2241 = new C2240(getView(), this);
        this.f3137 = c2241;
        return c2241;
    }

    private final C5686 get_composeViewContext() {
        return (C5686) this.f3139.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5755 get_viewTreeOwners() {
        AbstractC2049.m4001(this.f3087.getValue());
        return null;
    }

    private final void setAttached(boolean z) {
        this.f3073.setValue(Boolean.valueOf(z));
    }

    private void setDensity(InterfaceC2880 interfaceC2880) {
        this.f3077.setValue(interfaceC2880);
    }

    private void setFontFamilyResolver(InterfaceC4434 interfaceC4434) {
        this.f3088.setValue(interfaceC4434);
    }

    private void setLayoutDirection(EnumC2459 enumC2459) {
        this.f3106.setValue(enumC2459);
    }

    private final void set_composeViewContext(C5686 c5686) {
        this.f3139.setValue(c5686);
    }

    private final void set_viewTreeOwners(AbstractC5755 abstractC5755) {
        this.f3087.setValue(abstractC5755);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static long m1765(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m1767(C0605 c0605) {
        c0605.m1357();
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            m1767((C0605) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static View m1768(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC3831.m6874(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewM1768 = m1768(viewGroup.getChildAt(i2), i);
                    if (viewM1768 != null) {
                        return viewM1768;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m1769(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0850) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0850) childAt).m1774();
            } else if (childAt instanceof ViewGroup) {
                m1769((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static boolean m1770() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static boolean m1771(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C4149.f13807.m7328(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C3468 c3468 = ((C2016) getFocusOwner()).f6637;
        if (!c3468.f17786) {
            return;
        }
        if (!c3468.f17791.f17786) {
            AbstractC3480.m6278("visitSubtreeIf called on an unattached node");
        }
        C0863 c0863 = new C0863(new AbstractC5381[16]);
        AbstractC5381 abstractC5381 = c3468.f17791;
        AbstractC5381 abstractC5382 = abstractC5381.f17783;
        if (abstractC5382 == null) {
            AbstractC5537.m9249(c0863, abstractC5381);
        } else {
            c0863.m1843(abstractC5382);
        }
        while (true) {
            int i3 = c0863.f3180;
            if (i3 == 0) {
                return;
            }
            AbstractC5381 abstractC5383 = (AbstractC5381) c0863.m1850(i3 - 1);
            if ((abstractC5383.f17782 & 1024) != 0) {
                for (AbstractC5381 abstractC5384 = abstractC5383; abstractC5384 != null && abstractC5384.f17786; abstractC5384 = abstractC5384.f17783) {
                    if ((abstractC5384.f17781 & 1024) != 0) {
                        AbstractC5381 abstractC5381M9233 = abstractC5384;
                        C0863 c0864 = null;
                        while (abstractC5381M9233 != null) {
                            int i4 = 0;
                            if (abstractC5381M9233 instanceof C3468) {
                                C3468 c3469 = (C3468) abstractC5381M9233;
                                if (c3469.f17786 && c3469.m6250().f4555) {
                                    super.addFocusables(arrayList, i, i2);
                                    C3468 c34610 = ((C2016) getFocusOwner()).f6637;
                                    if (c34610.f17786) {
                                        if (!c34610.f17791.f17786) {
                                            AbstractC3480.m6278("visitSubtreeIf called on an unattached node");
                                        }
                                        C0863 c0865 = new C0863(new AbstractC5381[16]);
                                        AbstractC5381 abstractC5385 = c34610.f17791;
                                        AbstractC5381 abstractC5386 = abstractC5385.f17783;
                                        if (abstractC5386 == null) {
                                            AbstractC5537.m9249(c0865, abstractC5385);
                                        } else {
                                            c0865.m1843(abstractC5386);
                                        }
                                        while (true) {
                                            int i5 = c0865.f3180;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            AbstractC5381 abstractC5387 = (AbstractC5381) c0865.m1850(i5 - 1);
                                            if ((abstractC5387.f17782 & 1024) != 0) {
                                                for (AbstractC5381 abstractC5388 = abstractC5387; abstractC5388 != null && abstractC5388.f17786; abstractC5388 = abstractC5388.f17783) {
                                                    if ((abstractC5388.f17781 & 1024) != 0) {
                                                        AbstractC5381 abstractC5381M9234 = abstractC5388;
                                                        C0863 c0866 = null;
                                                        while (abstractC5381M9234 != null) {
                                                            if (abstractC5381M9234 instanceof C3468) {
                                                                C3468 c34611 = (C3468) abstractC5381M9234;
                                                                if (c34611.f17786) {
                                                                    C1321 c1321M6250 = c34611.m6250();
                                                                    if (c34611.f17786 && !c34611.f11507 && c1321M6250.f4555) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((abstractC5381M9234.f17781 & 1024) != 0 && (abstractC5381M9234 instanceof AbstractC3019)) {
                                                                int i6 = 0;
                                                                for (AbstractC5381 abstractC5389 = ((AbstractC3019) abstractC5381M9234).f10167; abstractC5389 != null; abstractC5389 = abstractC5389.f17783) {
                                                                    if ((abstractC5389.f17781 & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            abstractC5381M9234 = abstractC5389;
                                                                        } else {
                                                                            if (c0866 == null) {
                                                                                c0866 = new C0863(new AbstractC5381[16]);
                                                                            }
                                                                            if (abstractC5381M9234 != null) {
                                                                                c0866.m1843(abstractC5381M9234);
                                                                                abstractC5381M9234 = null;
                                                                            }
                                                                            c0866.m1843(abstractC5389);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            abstractC5381M9234 = AbstractC5537.m9233(c0866);
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC5537.m9249(c0865, abstractC5387);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((abstractC5381M9233.f17781 & 1024) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                for (AbstractC5381 abstractC53810 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC53810 != null; abstractC53810 = abstractC53810.f17783) {
                                    if ((abstractC53810.f17781 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC5381M9233 = abstractC53810;
                                        } else {
                                            if (c0864 == null) {
                                                c0864 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (abstractC5381M9233 != null) {
                                                c0864.m1843(abstractC5381M9233);
                                                abstractC5381M9233 = null;
                                            }
                                            c0864.m1843(abstractC53810);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC5381M9233 = AbstractC5537.m9233(c0864);
                        }
                    }
                }
            }
            AbstractC5537.m9249(c0863, abstractC5383);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C2542 c2542M1331;
        InterfaceC4745 interfaceC4745;
        InterfaceC4745 interfaceC4746;
        C0193 c0193 = this.f3131;
        if (c0193 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                C0605 c0605 = (C0605) c0193.f719.f18176.m9571(iKeyAt);
                if (c0605 != null && (c2542M1331 = c0605.m1331()) != null) {
                    C3262 c3262 = c2542M1331.f8490;
                    Object objM6027 = c3262.m6027(AbstractC0208.f784);
                    if (objM6027 == null) {
                        objM6027 = null;
                    }
                    C0078 c0078 = (C0078) objM6027;
                    if (c0078 != null && (interfaceC4746 = (InterfaceC4745) c0078.f14720) != null) {
                    }
                    Object objM6028 = c3262.m6027(AbstractC0208.f773);
                    C0078 c0079 = (C0078) (objM6028 != null ? objM6028 : null);
                    if (c0079 != null && (interfaceC4745 = (InterfaceC4745) c0079.f14720) != null) {
                    }
                }
            }
        }
        C1489 c1489 = this.f3097;
        if (c1489 != null) {
            C5488 c5488 = (C5488) c1489.f5057;
            if (c5488.f18097.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c5488.f18097.get(Integer.valueOf(iKeyAt2)) != null) {
                        C0178.m382();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new C1345("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new C1345("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new C1345("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f3129.m4498(i, this.f3130, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f3129.m4498(i, this.f3130, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C2730 c2730 = this.f3100;
        if (!isAttachedToWindow()) {
            m1767(getRoot());
        }
        m1781(true);
        AbstractC1538.m3278().mo4468();
        this.f3089 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            C3379 c3379 = this.f3107;
            C0979 c0979 = c3379.f11267;
            Canvas canvas2 = c0979.f3447;
            c0979.f3447 = canvas;
            getRoot().m1358(c0979, null);
            c3379.f11267.f3447 = canvas2;
            if (c2730.m5084()) {
                int i = c2730.f9040;
                for (int i2 = 0; i2 < i; i2++) {
                    ((C0281) ((InterfaceC4384) c2730.m5076(i2))).m590();
                }
            }
            int i3 = AbstractC1856.f6195;
            c2730.m5080();
            this.f3089 = false;
            Trace.endSection();
            C2730 c2731 = this.f3081;
            if (c2731 != null) {
                c2730.m5077(c2731);
                c2731.m5080();
            }
            if (m1770()) {
                AbstractC0660.m1468(this, this.f3132);
                View view = this.f3061;
                if (view != null) {
                    AbstractC0660.m1468(view, this.f3120);
                    if (!Float.isNaN(this.f3120)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f3132 = Float.NaN;
                this.f3120 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
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
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewTreeObserverOnGlobalLayoutListenerC0850.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.f3057;
        RunnableC3027 runnableC3027 = this.f3080;
        if (z) {
            removeCallbacks(runnableC3027);
            runnableC3027.run();
        }
        if (!m1771(motionEvent) && isAttachedToWindow()) {
            ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = this.f3129;
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = viewOnAttachStateChangeListenerC2392.f7934;
            AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC2392.f7957;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    viewTreeObserverOnGlobalLayoutListenerC0850.m1781(true);
                    C0679 c0679 = new C0679();
                    C0605 root = viewTreeObserverOnGlobalLayoutListenerC0850.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    C2457 c2457 = root.f2256;
                    AbstractC1311 abstractC1311 = (AbstractC1311) c2457.f8201;
                    C1117 c1117 = AbstractC1311.f4507;
                    ((AbstractC1311) c2457.f8201).m9776(AbstractC1311.f4508, abstractC1311.m2776(jFloatToRawIntBits), c0679, 1, true);
                    int iM4181 = AbstractC2164.m4181(c0679);
                    while (true) {
                        if (-1 < iM4181) {
                            C0605 c0605M9270 = AbstractC5537.m9270((AbstractC5381) c0679.f2484.m5076(iM4181));
                            if (viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c0605M9270) == null) {
                                if (c0605M9270.f2256.m4585(8)) {
                                    int iM4511 = viewOnAttachStateChangeListenerC2392.m4511(c0605M9270.f2273);
                                    C3129 c3129M3032 = AbstractC1434.m3032(c0605M9270, false);
                                    if (AbstractC2776.m5218(c3129M3032)) {
                                        if (!c3129M3032.m5769().f8490.m6015(AbstractC2771.f9215)) {
                                            i = iM4511;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                iM4181--;
                            }
                        }
                        i = Integer.MIN_VALUE;
                        break;
                    }
                    viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i2 = viewOnAttachStateChangeListenerC2392.f7933;
                    if (i2 != i) {
                        viewOnAttachStateChangeListenerC2392.f7933 = i;
                        ViewOnAttachStateChangeListenerC2392.m4479(viewOnAttachStateChangeListenerC2392, i, 128, null, 12);
                        ViewOnAttachStateChangeListenerC2392.m4479(viewOnAttachStateChangeListenerC2392, i2, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i3 = viewOnAttachStateChangeListenerC2392.f7933;
                    if (i3 == Integer.MIN_VALUE) {
                        viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i3 != Integer.MIN_VALUE) {
                        viewOnAttachStateChangeListenerC2392.f7933 = Integer.MIN_VALUE;
                        ViewOnAttachStateChangeListenerC2392.m4479(viewOnAttachStateChangeListenerC2392, Integer.MIN_VALUE, 128, null, 12);
                        ViewOnAttachStateChangeListenerC2392.m4479(viewOnAttachStateChangeListenerC2392, i3, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m1777(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f3108;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f3108 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f3057 = true;
                        postDelayed(runnableC3027, 8L);
                        return false;
                    }
                } else if ((m1797(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (m1778(motionEvent)) {
                if ((m1797(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((C2016) getFocusOwner()).m3930(keyEvent, new C5304(i, this, keyEvent));
        }
        C3194 c3194 = getComposeViewContext().f18691;
        AbstractC4829.f15905.setValue(new C1444(keyEvent.getMetaState()));
        return ((C2016) getFocusOwner()).m3930(keyEvent, C3709.f12357) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C2457 c2457;
        if (isFocused()) {
            C2016 c2016 = (C2016) getFocusOwner();
            if (c2016.f6643.f6053) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C3468 c3468M7060 = AbstractC3925.m7060(c2016.f6637);
                if (c3468M7060 != null) {
                    if (!c3468M7060.f17791.f17786) {
                        AbstractC3480.m6278("visitAncestors called on an unattached node");
                    }
                    AbstractC5381 abstractC5381 = c3468M7060.f17791;
                    C0605 c0605M9270 = AbstractC5537.m9270(c3468M7060);
                    while (c0605M9270 != null) {
                        if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 131072) != 0) {
                            while (abstractC5381 != null) {
                                if ((abstractC5381.f17781 & 131072) != 0) {
                                    AbstractC5381 abstractC5381M9233 = abstractC5381;
                                    C0863 c0863 = null;
                                    while (abstractC5381M9233 != null) {
                                        if ((abstractC5381M9233.f17781 & 131072) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                            int i = 0;
                                            for (AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
                                                if ((abstractC5382.f17781 & 131072) != 0) {
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
                                }
                                abstractC5381 = abstractC5381.f17780;
                            }
                        }
                        c0605M9270 = c0605M9270.m1356();
                        abstractC5381 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C4039.f13467.m7235(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c1956;
        C3468 c3468M3926;
        if (this.f3057) {
            RunnableC3027 runnableC3027 = this.f3080;
            removeCallbacks(runnableC3027);
            MotionEvent motionEvent2 = this.f3108;
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f3057 = false;
            } else {
                runnableC3027.run();
            }
        }
        if (!m1771(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m1778(motionEvent))) {
            int iM1797 = m1797(motionEvent);
            if ((iM1797 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c1956 = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    c1956 = new C1956(1);
                }
                if (c1956.equals(new C1956(1)) && (c3468M3926 = ((C2016) getFocusOwner()).m3926()) != null) {
                    AbstractC1311 abstractC1311M9247 = AbstractC5537.m9247(c3468M3926);
                    if (!C4773.m8145(abstractC1311M9247).mo2794(abstractC1311M9247, true).m5321((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((C2016) getFocusOwner()).m3927(8, false, true);
                    }
                }
            }
            if ((iM1797 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m1768(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        C2793 c2793M5405;
        if (view == null || this.f3125.f4714) {
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), view, i);
        if (viewFindNextFocus == null || !C4773.m8126(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            C3468 c3468M7060 = AbstractC3925.m7060(((C2016) getFocusOwner()).f6637);
            c2793M5405 = c3468M7060 != null ? AbstractC3925.m7032(c3468M7060) : null;
            if (c2793M5405 == null) {
                c2793M5405 = AbstractC2840.m5405(view, this);
            }
        } else {
            c2793M5405 = AbstractC2840.m5405(view, this);
        }
        C1057 c1057M5406 = AbstractC2840.m5406(i);
        int i2 = c1057M5406 != null ? c1057M5406.f3729 : 6;
        C5450 c5450 = new C5450();
        if (((C2016) getFocusOwner()).m3925(i2, c2793M5405, new C0302(c5450, 0)) == null) {
            return view;
        }
        Object obj = c5450.f17965;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || AbstractC4009.m7148(AbstractC3925.m7032((C3468) obj), AbstractC2840.m5405(viewFindNextFocus, this), c2793M5405, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final C0399 getAndroidViewsHandler$ui() {
        if (this.f3123 == null) {
            C0399 c0399 = new C0399(getContext());
            this.f3123 = c0399;
            addView(c0399, -1);
            requestLayout();
        }
        return this.f3123;
    }

    public InterfaceC5478 getAutofill() {
        return this.f3097;
    }

    public AbstractC1361 getAutofillManager() {
        return this.f3131;
    }

    public C5488 getAutofillTree() {
        return this.f3093;
    }

    public final C5686 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f3127;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f3138.getValue();
    }

    public final ViewOnAttachStateChangeListenerC4316 getContentCaptureManager$ui() {
        return this.f3134;
    }

    public InterfaceC3534 getCoroutineContext() {
        return this.f3096;
    }

    public InterfaceC2880 getDensity() {
        return (InterfaceC2880) this.f3077.getValue();
    }

    public C2793 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C3468 c3468M7060 = AbstractC3925.m7060(((C2016) getFocusOwner()).f6637);
            if (c3468M7060 != null) {
                return AbstractC3925.m7032(c3468M7060);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC2840.m5405(viewFindFocus, this);
        }
        return null;
    }

    public InterfaceC0475 getFocusOwner() {
        return this.f3058;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C2793 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f9343);
            rect.top = Math.round(embeddedViewFocusRect.f9342);
            rect.right = Math.round(embeddedViewFocusRect.f9341);
            rect.bottom = Math.round(embeddedViewFocusRect.f9344);
            return;
        }
        if (AbstractC3831.m6874(((C2016) getFocusOwner()).m3925(6, null, C1931.f6362), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public InterfaceC4434 getFontFamilyResolver() {
        return (InterfaceC4434) this.f3088.getValue();
    }

    public InterfaceC0601 getFontLoader() {
        return this.f3112;
    }

    public final InterfaceC4544 getFrameEndScheduler$ui() {
        return this.f3074;
    }

    public InterfaceC5449 getGraphicsContext() {
        return this.f3079;
    }

    public InterfaceC1922 getHapticFeedBack() {
        return this.f3109;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((C2808) this.f3125.f4712).m5354() || !this.f3084.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC0310 getInputModeManager() {
        return this.f3113;
    }

    public final RunnableC4868 getInsetsListener() {
        return this.f3095;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f3110;
    }

    @Override // android.view.View, android.view.ViewParent
    public EnumC2459 getLayoutDirection() {
        return (EnumC2459) this.f3106.getValue();
    }

    public C5668 getLocaleList() {
        return (C5668) this.f3094.getValue();
    }

    public long getMeasureIteration() {
        if (this.f3125.f4714) {
            return 1L;
        }
        AbstractC3480.m6279("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    public C4525 getModifierLocalManager() {
        return this.f3054;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public ViewTreeObserverOnGlobalLayoutListenerC0850 m9772getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public AbstractC1842 getPlacementScope() {
        int i = AbstractC3458.f11474;
        return new C4624(1, this);
    }

    public InterfaceC2199 getPointerIconService() {
        return this.f19557;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final C1040 m9765getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f3071;
    }

    public C5461 getRectManager() {
        return this.f3117;
    }

    public InterfaceC5876 getRetainedValuesStore() {
        return this.f3128;
    }

    public C0605 getRoot() {
        return this.f3105;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        C0926 c0926;
        if (Build.VERSION.SDK_INT < 31 || (c0926 = this.f3136) == null) {
            return false;
        }
        return ((Boolean) c0926.f3310.getValue()).booleanValue();
    }

    public C5505 getSemanticsOwner() {
        return this.f3059;
    }

    public C2497 getSharedDrawScope() {
        return this.f3068;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C2502.f8319.m4650(this) : this.f3098;
    }

    public C1775 getSnapshotObserver() {
        return this.f3092;
    }

    public InterfaceC3508 getSoftwareKeyboardController() {
        C3773 c3773 = this.f3126;
        if (c3773 != null) {
            return c3773;
        }
        C3773 c3774 = new C3773(getTextInputService());
        this.f3126 = c3774;
        return c3774;
    }

    public C1568 getTextInputService() {
        C1568 c1568 = this.f3099;
        if (c1568 != null) {
            return c1568;
        }
        C1568 c1569 = new C1568(getLegacyTextInputServiceAndroid());
        this.f3099 = c1569;
        return c1569;
    }

    public InterfaceC0493 getTextToolbar() {
        return this.f3114;
    }

    public final InterfaceC3246 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public InterfaceC2509 getViewConfiguration() {
        return this.f3104;
    }

    public final AbstractC5755 getViewTreeOwners() {
        AbstractC2049.m4001(this.f3075.getValue());
        return null;
    }

    public InterfaceC0930 getWindowInfo() {
        return getComposeViewContext().f18691;
    }

    public final C0193 get_autofillManager$ui() {
        return this.f3131;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC5876 interfaceC5876;
        Object obj;
        super.onAttachedToWindow();
        int i = 1;
        setAttached(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            setShowLayoutBounds(AbstractC2774.m5182());
        }
        this.f3095.onViewAttachedToWindow(this);
        int i3 = 0;
        if (i2 > 28) {
            if (f19555 == null) {
                RunnableC4026 runnableC4026 = new RunnableC4026(i);
                f19555 = runnableC4026;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f19551 == null) {
                        f19551 = Class.forName("android.os.SystemProperties");
                    }
                    Method declaredMethod = f19552;
                    if (declaredMethod == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f19551;
                        declaredMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        f19552 = declaredMethod;
                    }
                    if (declaredMethod != null) {
                        declaredMethod.invoke(null, runnableC4026);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C2730 c2730 = f19554;
            synchronized (c2730) {
                c2730.m5079(this);
            }
        }
        if (!this.f3127) {
            getComposeViewContext().m9500();
        }
        this.f3127 = false;
        m1790(getRoot());
        m1767(getRoot());
        getSnapshotObserver().f5926.m9080();
        C1489 c1489 = this.f3097;
        if (c1489 != null) {
            C0536 c0536 = C0536.f1902;
            c0536.getClass();
            ((AutofillManager) c1489.f5058).registerCallback(c0536);
        }
        InterfaceC4507 interfaceC4507 = getComposeViewContext().f18690;
        InterfaceC4680 interfaceC4680 = getComposeViewContext().f18692;
        InterfaceC4544 interfaceC4544 = this.f3074;
        if (interfaceC4507 == null || interfaceC4680 == null || interfaceC4544 == null) {
            interfaceC5876 = null;
        } else {
            C1489 c14810 = new C1489(interfaceC4680.mo651(), new C4369(4), C4390.f14468);
            C3131 c3131M8557 = AbstractC5041.m8557(C1594.class);
            String strM5776 = c3131M8557.m5776();
            if (strM5776 == null) {
                C1078.m2272("Local and anonymous classes can not be ViewModels");
                return;
            }
            C1594 c1594 = (C1594) c14810.m3136(c3131M8557, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM5776));
            int id = ((View) getParent()).getId();
            C4912 c4912 = c1594.f5352;
            Object objM9571 = c4912.m9571(id);
            if (objM9571 == null) {
                objM9571 = new C2730(1);
                c4912.m8319(id, objM9571);
            }
            C2730 c2731 = (C2730) objM9571;
            Object[] objArr = c2731.f9041;
            int i4 = c2731.f9040;
            while (true) {
                if (i3 >= i4) {
                    obj = null;
                    break;
                }
                obj = objArr[i3];
                if (!((C4782) obj).f15777) {
                    break;
                } else {
                    i3++;
                }
            }
            C4782 c4782 = (C4782) obj;
            if (c4782 == null) {
                c4782 = new C4782();
                c2731.m5079(c4782);
            }
            c4782.f15777 = true;
            this.f3118 = c4782;
            interfaceC5876 = c4782.f15778;
        }
        if (interfaceC5876 == null) {
            interfaceC5876 = C1298.f4455;
        }
        this.f3128 = interfaceC5876;
        InterfaceC4745 interfaceC4745 = this.f3115;
        if (interfaceC4745 != null) {
            interfaceC4745.mo211(getComposeViewContext());
            this.f3115 = null;
        }
        AbstractC1434 abstractC1434Mo110 = getComposeViewContext().f18690.mo110();
        abstractC1434Mo110.mo2388(this);
        abstractC1434Mo110.mo2388(this.f3134);
        this.f3113.f12859.setValue(new C0119(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C4302.f14231.m7587(this);
        }
        C0193 c0193 = this.f3131;
        if (c0193 != null) {
            ((C2016) getFocusOwner()).f6644.m5079(c0193);
            getSemanticsOwner().f18179.m5079(c0193);
        }
        ((C2016) getFocusOwner()).f6644.m5079(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C5613 c5613 = (C5613) this.f3090.get();
        C0717 c0717 = (C0717) (c5613 != null ? c5613.f18472 : null);
        if (c0717 == null) {
            return getLegacyTextInputServiceAndroid().f7420;
        }
        C5613 c5614 = (C5613) c0717.f2623.get();
        C4785 c4785 = (C4785) (c5614 != null ? c5614.f18472 : null);
        return c4785 != null && (c4785.f15783 ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1773(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i2;
        int i3;
        int i4;
        C5613 c5613 = (C5613) this.f3090.get();
        C0717 c0717 = (C0717) (c5613 != null ? c5613.f18472 : null);
        if (c0717 == null) {
            C2240 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.f7420) {
                C2350 c2350 = legacyTextInputServiceAndroid.f7418;
                C5745 c5745 = legacyTextInputServiceAndroid.f7426;
                int i5 = c2350.f7792;
                boolean z = c2350.f7795;
                if (i5 == 1) {
                    i = z ? 6 : 0;
                } else if (i5 == 0) {
                    i = 1;
                } else if (i5 == 2) {
                    i = 2;
                } else if (i5 == 6) {
                    i = 5;
                } else if (i5 == 5) {
                    i = 7;
                } else if (i5 == 3) {
                    i = 3;
                } else if (i5 == 4) {
                    i = 4;
                } else {
                    if (i5 != 7) {
                        C1078.m2276("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i;
                int i6 = c2350.f7796;
                if (i6 != 1) {
                    if (i6 == 2) {
                        editorInfo.inputType = 1;
                        i |= Integer.MIN_VALUE;
                        editorInfo.imeOptions = i;
                    } else if (i6 == 3) {
                        editorInfo.inputType = 2;
                        i2 = 2;
                    } else if (i6 == 4) {
                        editorInfo.inputType = 3;
                        i2 = 3;
                    } else if (i6 == 5) {
                        i2 = 17;
                        editorInfo.inputType = 17;
                    } else if (i6 == 6) {
                        i2 = 33;
                        editorInfo.inputType = 33;
                    } else if (i6 == 7) {
                        i2 = 129;
                        editorInfo.inputType = 129;
                    } else if (i6 == 8) {
                        i2 = 18;
                        editorInfo.inputType = 18;
                    } else {
                        if (i6 != 9) {
                            C1078.m2276("Invalid Keyboard Type");
                            return null;
                        }
                        i2 = 8194;
                        editorInfo.inputType = 8194;
                    }
                    i3 = i2;
                    if (!z && (i2 & 1) == 1) {
                        i3 |= 131072;
                        editorInfo.inputType = i3;
                        if (i5 == 1) {
                            editorInfo.imeOptions = 1073741824 | i;
                        }
                    }
                    if ((i3 & 1) == 1) {
                        i4 = c2350.f7794;
                        if (i4 == 1) {
                            i3 |= 4096;
                            editorInfo.inputType = i3;
                        } else if (i4 == 2) {
                            i3 |= 8192;
                            editorInfo.inputType = i3;
                        } else if (i4 == 3) {
                            i3 |= 16384;
                            editorInfo.inputType = i3;
                        }
                        if (c2350.f7791) {
                            editorInfo.inputType = 32768 | i3;
                        }
                    }
                    long j = c5745.f18943;
                    int i7 = C3346.f11195;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & 4294967295L);
                    AbstractC0487.m1062(editorInfo, c5745.f18944.f4307);
                    editorInfo.imeOptions |= 33554432;
                    InputConnectionC1187 inputConnectionC1187 = new InputConnectionC1187(legacyTextInputServiceAndroid.f7426, new C3121(25, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.f7418.f7791);
                    legacyTextInputServiceAndroid.f7424.add(new WeakReference(inputConnectionC1187));
                    return inputConnectionC1187;
                }
                editorInfo.inputType = 1;
                i2 = 1;
                i3 = i2;
                if (!z) {
                    i3 |= 131072;
                    editorInfo.inputType = i3;
                    if (i5 == 1) {
                        editorInfo.imeOptions = 1073741824 | i;
                    }
                }
                if ((i3 & 1) == 1) {
                    i4 = c2350.f7794;
                    if (i4 == 1) {
                        i3 |= 4096;
                        editorInfo.inputType = i3;
                    } else if (i4 == 2) {
                        i3 |= 8192;
                        editorInfo.inputType = i3;
                    } else if (i4 == 3) {
                        i3 |= 16384;
                        editorInfo.inputType = i3;
                    }
                    if (c2350.f7791) {
                        editorInfo.inputType = 32768 | i3;
                    }
                }
                long j2 = c5745.f18943;
                int i8 = C3346.f11195;
                editorInfo.initialSelStart = (int) (j2 >> 32);
                editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
                AbstractC0487.m1062(editorInfo, c5745.f18944.f4307);
                editorInfo.imeOptions |= 33554432;
                InputConnectionC1187 inputConnectionC1188 = new InputConnectionC1187(legacyTextInputServiceAndroid.f7426, new C3121(25, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.f7418.f7791);
                legacyTextInputServiceAndroid.f7424.add(new WeakReference(inputConnectionC1188));
                return inputConnectionC1188;
            }
        } else {
            C5613 c5614 = (C5613) c0717.f2623.get();
            C4785 c4785 = (C4785) (c5614 != null ? c5614.f18472 : null);
            if (c4785 != null) {
                synchronized (c4785.f15782) {
                    if (c4785.f15783) {
                        return null;
                    }
                    InputConnectionC4504 inputConnectionC4504M5090 = c4785.f15785.m5090(editorInfo);
                    C2932 c2932 = new C2932(20, c4785);
                    InputConnection c2618 = Build.VERSION.SDK_INT >= 34 ? new C2618(inputConnectionC4504M5090, c2932) : new InputConnectionC2290(inputConnectionC4504M5090, c2932);
                    c4785.f15786.m1843(new C5756(c2618));
                    return c2618;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316 = this.f3134;
        viewOnAttachStateChangeListenerC4316.getClass();
        AbstractC0797.m1703(viewOnAttachStateChangeListenerC4316, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.f3095.onViewDetachedFromWindow(this);
        View view = this.f3061;
        if (m1770() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            C2730 c2730 = f19554;
            synchronized (c2730) {
                c2730.m5083(this);
            }
        }
        getComposeViewContext().m9501();
        C5389 c5389 = getSnapshotObserver().f5926;
        C5322 c5322 = c5389.f17814;
        if (c5322 != null) {
            c5322.m8926();
        }
        c5389.m9079();
        AbstractC1434 abstractC1434Mo110 = getComposeViewContext().f18690.mo110();
        abstractC1434Mo110.mo2389(this.f3134);
        abstractC1434Mo110.mo2389(this);
        C1489 c1489 = this.f3097;
        if (c1489 != null) {
            C0536 c0536 = C0536.f1902;
            c0536.getClass();
            ((AutofillManager) c1489.f5058).unregisterCallback(c0536);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        C4782 c4782 = this.f3118;
        if (c4782 != null) {
            c4782.f15777 = false;
        }
        this.f3118 = null;
        if (i >= 31) {
            C4302.f14231.m7588(this);
        }
        C0193 c0193 = this.f3131;
        if (c0193 != null) {
            getSemanticsOwner().f18179.m5083(c0193);
            ((C2016) getFocusOwner()).f6644.m5083(c0193);
        }
        C5461 rectManager = getRectManager();
        rectManager.f18005 = rectManager.f18003.m3294(0L, 0L, null, 0, 0);
        getRectManager().m9138();
        C5461 rectManager2 = getRectManager();
        RunnableC1056 runnableC1056 = rectManager2.f18007;
        if (runnableC1056 != null) {
            rectManager2.f18008.removeCallbacks(runnableC1056);
            rectManager2.f18007 = null;
        }
        ((C2016) getFocusOwner()).f6644.m5083(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        C2016 c2016 = (C2016) getFocusOwner();
        AbstractC1434.m3057(c2016.f6637, true);
        if (c2016.m3926() != null) {
            C3468 c3468M3926 = c2016.m3926();
            c2016.m3932(null);
            if (c3468M3926 != null) {
                c3468M3926.m6251(EnumC4125.f13742, EnumC4125.f13739);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f3110 = 0L;
        m1799();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        m1773(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f3110 = 0L;
            this.f3125.m2928(this.f3103);
            this.f3124 = null;
            m1799();
            if (this.f3123 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C1377 c1377 = this.f3125;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m1790(getRoot());
            }
            long jM1765 = m1765(i);
            long jM1766 = m1765(i2);
            long jM8622 = C5063.m8622((int) (jM1765 >>> 32), (int) (jM1765 & 4294967295L), (int) (jM1766 >>> 32), (int) (4294967295L & jM1766));
            C3693 c3693 = this.f3124;
            if (c3693 == null) {
                this.f3124 = new C3693(jM8622);
                this.f3082 = false;
            } else if (!C3693.m6547(c3693.f12325, jM8622)) {
                this.f3082 = true;
            }
            c1377.m2930(jM8622);
            c1377.m2934();
            setMeasuredDimension(getRoot().f2261.f4252.f985, getRoot().f2261.f4252.f984);
            if (this.f3123 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f2261.f4252.f985, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f2261.f4252.f984, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            C0193 c0193 = this.f3131;
            if (c0193 != null) {
                C0605 c0605 = c0193.f719.f18178;
                AutofillId autofillId = c0193.f717;
                String str = c0193.f712;
                C5461 c5461 = c0193.f714;
                AbstractC3925.m7054(viewStructure, c0605, autofillId, str, c5461);
                Object[] objArr = AbstractC3667.f12261;
                C2730 c2730 = new C2730(2);
                c2730.m5079(c0605);
                c2730.m5079(viewStructure);
                while (c2730.m5084()) {
                    ViewStructure viewStructure2 = (ViewStructure) c2730.m5085(c2730.f9040 - 1);
                    C3482 c3482 = (C3482) ((C0605) c2730.m5085(c2730.f9040 - 1)).m1361();
                    int i2 = ((C0863) c3482.f11560).f3180;
                    for (int i3 = 0; i3 < i2; i3++) {
                        C0605 c0606 = (C0605) c3482.get(i3);
                        if (!c0606.f2242 && c0606.m1348() && c0606.m1342()) {
                            C2542 c2542M1331 = c0606.m1331();
                            if (c2542M1331 != null) {
                                C3262 c3262 = c2542M1331.f8490;
                                if (c3262.m6018(AbstractC0208.f784) || c3262.m6018(AbstractC0208.f773) || c3262.m6018(AbstractC2771.f9203) || c3262.m6018(AbstractC2771.f9199)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    AbstractC3925.m7054(viewStructureNewChild, c0606, autofillId, str, c5461);
                                    c2730.m5079(c0606);
                                    c2730.m5079(viewStructureNewChild);
                                } else {
                                    c2730.m5079(c0606);
                                    c2730.m5079(viewStructure2);
                                }
                            } else {
                                c2730.m5079(c0606);
                                c2730.m5079(viewStructure2);
                            }
                        }
                    }
                }
            }
            C1489 c1489 = this.f3097;
            if (c1489 != null) {
                C5488 c5488 = (C5488) c1489.f5057;
                LinkedHashMap linkedHashMap = c5488.f18097;
                LinkedHashMap linkedHashMap2 = c5488.f18097;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        C0178.m382();
                        return;
                    }
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) c1489.f5056, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((ViewTreeObserverOnGlobalLayoutListenerC0850) c1489.f5059).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        InterfaceC3737 interfaceC3737;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC3737 = ((C1113) getPointerIconService()).f3903) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return interfaceC3737 instanceof C4885 ? PointerIcon.getSystemIcon(context, ((C4885) interfaceC3737).f16068) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        EnumC2459 enumC2459;
        if (this.f3070) {
            int[] iArr = AbstractC2840.f9486;
            EnumC2459 enumC24510 = EnumC2459.f8215;
            if (i != 0) {
                enumC2459 = i != 1 ? null : EnumC2459.f8214;
            } else {
                enumC2459 = enumC24510;
            }
            if (enumC2459 != null) {
                enumC24510 = enumC2459;
            }
            setLayoutDirection(enumC24510);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C0926 c0926;
        if (Build.VERSION.SDK_INT < 31 || (c0926 = this.f3136) == null) {
            return;
        }
        c0926.m1902(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m1799();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.f3113.f12859.setValue(new C0119(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316 = this.f3134;
        viewOnAttachStateChangeListenerC4316.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC3831.m6874(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC0797.m1704(viewOnAttachStateChangeListenerC4316, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC4316.f14275.post(new RunnableC5689(0, viewOnAttachStateChangeListenerC4316, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zM5182;
        this.f3083 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM5182 = AbstractC2774.m5182())) {
            return;
        }
        setShowLayoutBounds(zM5182);
        m1767(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            C1057 c1057M5406 = AbstractC2840.m5406(i);
            int i3 = c1057M5406 != null ? c1057M5406.f3729 : 7;
            Boolean boolM3925 = ((C2016) getFocusOwner()).m3925(i3, rect != null ? AbstractC4225.m7460(rect) : null, new C2180(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!AbstractC3831.m6874(boolM3925, bool)) {
                if (!AbstractC3831.m6874(((C2016) getFocusOwner()).m3925(i3, null, new C2180(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((C2016) getFocusOwner()).m3928(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f3129.f7959 = j;
    }

    public final void setComposeViewContext(C5686 c5686) {
        if (getCoroutineContext() != c5686.f18698.mo1009() && !((C3482) getRoot().m1361()).isEmpty()) {
            AbstractC3480.m6279("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
        try {
            C5686 c5687 = get_composeViewContext();
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            if (c5686 != c5687) {
                if (isAttachedToWindow()) {
                    c5687.m9501();
                    c5686.m9500();
                }
                set_composeViewContext(c5686);
                setCoroutineContext(c5686.f18698.mo1009());
            }
        } catch (Throwable th) {
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.f3127 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f3138.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316) {
        this.f3134 = viewOnAttachStateChangeListenerC4316;
    }

    public void setCoroutineContext(InterfaceC3534 interfaceC3534) {
        this.f3096 = interfaceC3534;
    }

    public final void setFrameEndScheduler$ui(InterfaceC4544 interfaceC4544) {
        this.f3074 = interfaceC4544;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f3110 = j;
    }

    public final void setOnReadyForComposition(InterfaceC4745 interfaceC4745) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f3127) {
            interfaceC4745.mo211(getComposeViewContext());
        } else {
            this.f3115 = interfaceC4745;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m9766setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(C1040 c1040) {
        this.f3071 = c1040;
    }

    public void setShowLayoutBounds(boolean z) {
        this.f3098 = z;
    }

    public void setUncaughtExceptionHandler(InterfaceC3246 interfaceC3246) {
        this.f3125.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m1772(C0605 c0605) {
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = this.f3129;
        viewOnAttachStateChangeListenerC2392.f7956 = true;
        if (viewOnAttachStateChangeListenerC2392.m4492()) {
            viewOnAttachStateChangeListenerC2392.m4493(c0605);
        }
        ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316 = this.f3134;
        viewOnAttachStateChangeListenerC4316.f14268 = true;
        if (viewOnAttachStateChangeListenerC4316.m7611()) {
            viewOnAttachStateChangeListenerC4316.f14272.mo5597(C2358.f7817);
        }
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final void m1773(Configuration configuration) {
        C4852 c4852;
        Configuration configuration2 = getConfiguration();
        if (AbstractC3831.m6874(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AbstractC4009.m7168(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (c4852 = this.f3121.f10731) == null) {
            return;
        }
        c4852.setValue(AbstractC5537.m9256(this));
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m1774() {
        C2730 c2730;
        Object[] objArr;
        if (this.f3069) {
            C5389 c5389 = getSnapshotObserver().f5926;
            synchronized (c5389.f17819) {
                try {
                    C0863 c0863 = c5389.f17812;
                    int i = c0863.f3180;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = c0863.f3182;
                        if (i2 >= i) {
                            break;
                        }
                        C5471 c5471 = (C5471) objArr[i2];
                        c5471.m9166();
                        if (!c5471.f18040.m6024()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = c0863.f3182;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    c0863.f3180 = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f3069 = false;
        }
        C0399 c0399 = this.f3123;
        if (c0399 != null) {
            m1769(c0399);
        }
        C0193 c0193 = this.f3131;
        if (c0193 != null) {
            C0482 c0482 = c0193.f718;
            if (c0482.f1752 == 0 && c0193.f716) {
                ((AutofillManager) c0193.f720.f10451).commit();
                c0193.f716 = false;
            }
            if (c0482.f1752 != 0) {
                c0193.f716 = true;
            }
        }
        while (this.f3072.m5084() && this.f3072.m5076(0) != null) {
            int i5 = this.f3072.f9040;
            int i6 = 0;
            while (true) {
                c2730 = this.f3072;
                if (i6 < i5) {
                    InterfaceC4448 interfaceC4448 = (InterfaceC4448) c2730.m5076(i6);
                    this.f3072.m5087(i6, null);
                    if (interfaceC4448 != null) {
                        interfaceC4448.mo449();
                    }
                    i6++;
                }
            }
            c2730.m5081(0, i5);
        }
    }

    @Override // p000.InterfaceC0280
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo456(C3468 c3468, C3468 c3469) {
        C2457 c2457;
        boolean z;
        C2457 c2458;
        boolean z2;
        if (c3468 != null) {
            C3468 c34610 = c3468;
            if (!c34610.f17791.f17786) {
                AbstractC3480.m6278("visitAncestors called on an unattached node");
            }
            AbstractC5381 abstractC5381 = c34610.f17791;
            C0605 c0605M9270 = AbstractC5537.m9270(c3468);
            C3639 c3639 = null;
            ArrayList arrayList = null;
            while (c0605M9270 != null) {
                if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 2097152) != 0) {
                    while (abstractC5381 != null) {
                        if ((abstractC5381.f17781 & 2097152) != 0) {
                            AbstractC5381 abstractC5381M9233 = abstractC5381;
                            C0863 c0863 = null;
                            while (abstractC5381M9233 != null) {
                                if (abstractC5381M9233 instanceof InterfaceC5119) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC5381M9233);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (abstractC5381M9233.f17781 & 2097152) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                    int i = 0;
                                    for (AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
                                        if ((abstractC5382.f17781 & 2097152) != 0) {
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
                        }
                        abstractC5381 = abstractC5381.f17780;
                    }
                }
                c0605M9270 = c0605M9270.m1356();
                abstractC5381 = (c0605M9270 == null || (c2458 = c0605M9270.f2256) == null) ? null : (C1850) c2458.f8202;
            }
            if (arrayList == null) {
                return;
            }
            if (c3469 != null) {
                if (!c3469.f17791.f17786) {
                    AbstractC3480.m6278("visitAncestors called on an unattached node");
                }
                AbstractC5381 abstractC5383 = c3469.f17791;
                C0605 c0605M9271 = AbstractC5537.m9270(c3469);
                C3639 c36310 = null;
                while (c0605M9271 != null) {
                    if ((((AbstractC5381) c0605M9271.f2256.f8210).f17782 & 2097152) != 0) {
                        while (abstractC5383 != null) {
                            if ((abstractC5383.f17781 & 2097152) != 0) {
                                AbstractC5381 abstractC5381M9234 = abstractC5383;
                                C0863 c0864 = null;
                                while (abstractC5381M9234 != null) {
                                    if (abstractC5381M9234 instanceof InterfaceC5119) {
                                        if (c36310 == null) {
                                            C3639 c36311 = AbstractC5705.f18789;
                                            c36310 = new C3639();
                                        }
                                        c36310.m6495(abstractC5381M9234);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (abstractC5381M9234.f17781 & 2097152) != 0 && (abstractC5381M9234 instanceof AbstractC3019)) {
                                        int i2 = 0;
                                        for (AbstractC5381 abstractC5384 = ((AbstractC3019) abstractC5381M9234).f10167; abstractC5384 != null; abstractC5384 = abstractC5384.f17783) {
                                            if ((abstractC5384.f17781 & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    abstractC5381M9234 = abstractC5384;
                                                } else {
                                                    if (c0864 == null) {
                                                        c0864 = new C0863(new AbstractC5381[16]);
                                                    }
                                                    if (abstractC5381M9234 != null) {
                                                        c0864.m1843(abstractC5381M9234);
                                                        abstractC5381M9234 = null;
                                                    }
                                                    c0864.m1843(abstractC5384);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC5381M9234 = AbstractC5537.m9233(c0864);
                                }
                            }
                            abstractC5383 = abstractC5383.f17780;
                        }
                    }
                    c0605M9271 = c0605M9271.m1356();
                    abstractC5383 = (c0605M9271 == null || (c2457 = c0605M9271.f2256) == null) ? null : (C1850) c2457.f8202;
                }
                c3639 = c36310;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC5119 interfaceC5119 = (InterfaceC5119) arrayList.get(i3);
                if (!(c3639 != null ? c3639.m6490(interfaceC5119) : false)) {
                    interfaceC5119.mo1266();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m1775(C0605 c0605, boolean z, boolean z2) {
        C1233 c1233 = c0605.f2261;
        C1377 c1377 = this.f3125;
        if (!z) {
            c1377.getClass();
            int iM6632 = AbstractC3761.m6632(c1233.f4244);
            if (iM6632 == 0 || iM6632 == 1 || iM6632 == 2 || iM6632 == 3) {
                return;
            }
            if (iM6632 != 4) {
                C1078.m2275();
                return;
            }
            C0605 c0605M1356 = c0605.m1356();
            boolean z3 = c0605M1356 == null || c0605M1356.m1342();
            if (!z2) {
                if (c0605.m1324()) {
                    return;
                }
                if (c0605.m1364() && c0605.m1342() == z3 && c0605.m1342() == c1233.f4252.f7767) {
                    return;
                }
            }
            C2339 c2339 = c1233.f4252;
            c2339.f7762 = true;
            c2339.f7766 = true;
            if (!c0605.f2242 && c2339.f7767 && z3) {
                if ((c0605M1356 == null || !c0605M1356.m1364()) && (c0605M1356 == null || !c0605M1356.m1324())) {
                    ((C2808) c1377.f4712).m5348(4, c0605);
                }
                if (c1377.f4711) {
                    return;
                }
                m1787(null);
                return;
            }
            return;
        }
        C2808 c2808 = (C2808) c1377.f4712;
        int iM6633 = AbstractC3761.m6632(c1233.f4244);
        if (iM6633 != 0) {
            if (iM6633 == 1) {
                return;
            }
            if (iM6633 != 2) {
                if (iM6633 == 3) {
                    return;
                }
                if (iM6633 != 4) {
                    C1078.m2275();
                    return;
                }
            }
        }
        if ((c1233.f4238 || c1233.f4239) && !z2) {
            return;
        }
        c1233.f4239 = true;
        c1233.f4250 = true;
        C2339 c23310 = c1233.f4252;
        c23310.f7762 = true;
        c23310.f7766 = true;
        if (c0605.f2242) {
            return;
        }
        C0605 c0605M1357 = c0605.m1356();
        if (AbstractC3831.m6874(c0605.m1349(), Boolean.TRUE) && ((c0605M1357 == null || !c0605M1357.f2261.f4238) && (c0605M1357 == null || !c0605M1357.f2261.f4239))) {
            c2808.m5348(2, c0605);
        } else if (c0605.m1342() && ((c0605M1357 == null || !c0605M1357.m1364()) && (c0605M1357 == null || !c0605M1357.m1324()))) {
            c2808.m5348(4, c0605);
        }
        if (c1377.f4711) {
            return;
        }
        m1787(null);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m1776(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM8891;
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = this.f3129;
        if (AbstractC3831.m6874(str, viewOnAttachStateChangeListenerC2392.f7945)) {
            int iM8892 = viewOnAttachStateChangeListenerC2392.f7937.m8891(i);
            if (iM8892 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM8892);
                return;
            }
            return;
        }
        if (!AbstractC3831.m6874(str, viewOnAttachStateChangeListenerC2392.f7950) || (iM8891 = viewOnAttachStateChangeListenerC2392.f7939.m8891(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM8891);
    }

    /* JADX INFO: renamed from: ۥْ */
    public final boolean m1777(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m1778(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f3108) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m1779() {
        if (this.f3133) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f3110) {
            this.f3110 = jCurrentAnimationTimeMillis;
            InterfaceC0611 interfaceC0611 = this.f3119;
            float[] fArr = this.f3078;
            interfaceC0611.mo1375(this, fArr);
            AbstractC2164.m4182(fArr, this.f3135);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f3101;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f3066 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final boolean m1780(int i) {
        if (i != 7 && i != 8) {
            Integer numM5403 = AbstractC2840.m5403(i);
            if (numM5403 == null) {
                throw AbstractC3761.m6633("Invalid focus direction");
            }
            int iIntValue = numM5403.intValue();
            C3468 c3468M3926 = ((C2016) getFocusOwner()).m3926();
            if (c3468M3926 == null) {
                C1078.m2276("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numM5404 = AbstractC2840.m5403(i);
            if (numM5404 == null) {
                throw AbstractC3761.m6633("Invalid focus direction");
            }
            int iIntValue2 = numM5404.intValue();
            C4855 c4855 = AbstractC5537.m9270(c3468M3926).f2240;
            View interopView = c4855 != null ? c4855.getInteropView() : null;
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus(), iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !C4773.m8126(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return AbstractC2840.m5404(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m1781(boolean z) {
        C3155 c3155;
        C1377 c1377 = this.f3125;
        if (((C2808) c1377.f4712).m5354() || ((C0863) ((C3369) c1377.f4713).f11255).f3180 != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    c3155 = this.f3103;
                } finally {
                    Trace.endSection();
                }
            } else {
                c3155 = null;
            }
            if (c1377.m2928(c3155)) {
                requestLayout();
            }
            c1377.m2925(false);
            getRectManager().m9138();
            if (this.f3064) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f3064 = false;
            }
        }
    }

    @Override // p000.InterfaceC3240
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1782() {
        InterfaceC1663 interfaceC1663Mo990;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC2774.m5182());
        }
        C4782 c4782 = this.f3118;
        if (c4782 != null) {
            InterfaceC4544 interfaceC4544 = this.f3074;
            C3860 c3860 = (C3860) c4782.f15779.f10451;
            if (!c3860.f12892 || c3860.f12889) {
                return;
            }
            try {
                interfaceC1663Mo990 = ((C3371) interfaceC4544).f11257.mo990(new C5285(14, c4782));
            } catch (CancellationException unused) {
                if (!c3860.f12891) {
                    if (c3860.f12889) {
                        AbstractC2731.m5089("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c3860.m6893();
                    c3860.f12889 = true;
                }
                interfaceC1663Mo990 = null;
            }
            InterfaceC1663 interfaceC1663 = c4782.f15780;
            if (interfaceC1663 != null) {
                interfaceC1663.cancel();
            }
            c4782.f15780 = interfaceC1663Mo990;
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final void m1783(MotionEvent motionEvent) {
        this.f3110 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC0611 interfaceC0611 = this.f3119;
        float[] fArr = this.f3078;
        interfaceC0611.mo1375(this, fArr);
        AbstractC2164.m4182(fArr, this.f3135);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jM292 = C0132.m292((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM292 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM292 & 4294967295L));
        this.f3066 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    @Override // p000.InterfaceC3240
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1784() {
        C4782 c4782 = this.f3118;
        if (c4782 != null) {
            C3860 c3860 = (C3860) c4782.f15779.f10451;
            if (c3860.f12892 && !c3860.f12889) {
                InterfaceC1663 interfaceC1663 = c4782.f15780;
                if (interfaceC1663 != null) {
                    interfaceC1663.cancel();
                }
                c4782.f15780 = null;
                return;
            }
            if (c3860.f12891) {
                return;
            }
            if (!c3860.f12889) {
                AbstractC2731.m5089("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!c3860.f12890.m6025()) {
                AbstractC2731.m5089("Attempted to start retaining exited values with pending exited values");
            }
            c3860.f12889 = false;
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final long m1785(long j) {
        m1779();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f3066 >> 32));
        return C0132.m292((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f3066 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f3135);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m1786(C0605 c0605, boolean z, boolean z2, boolean z3) {
        C0605 c0605M1356;
        C0605 c0605M1357;
        C1377 c1377 = this.f3125;
        if (!z) {
            if (c1377.m2924(c0605, z2) && z3) {
                m1787(c0605);
                return;
            }
            return;
        }
        C2808 c2808 = (C2808) c1377.f4712;
        C0605 c0606 = c0605.f2271;
        C1233 c1233 = c0605.f2261;
        if (c0606 == null) {
            AbstractC3480.m6278("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iM6632 = AbstractC3761.m6632(c1233.f4244);
        if (iM6632 != 0) {
            if (iM6632 == 1) {
                return;
            }
            if (iM6632 != 2 && iM6632 != 3) {
                if (iM6632 != 4) {
                    C1078.m2275();
                    return;
                }
                if (!c1233.f4238 || z2) {
                    c1233.f4238 = true;
                    c1233.f4252.f7765 = true;
                    if (c0605.f2242) {
                        return;
                    }
                    if ((AbstractC3831.m6874(c0605.m1349(), Boolean.TRUE) || C1377.m2916(c0605)) && ((c0605M1356 = c0605.m1356()) == null || !c0605M1356.f2261.f4238)) {
                        c2808.m5348(1, c0605);
                    } else if ((c0605.m1342() || C1377.m2917(c0605)) && ((c0605M1357 = c0605.m1356()) == null || !c0605M1357.m1324())) {
                        c2808.m5348(3, c0605);
                    }
                    if (c1377.f4711 || !z3) {
                        return;
                    }
                    m1787(c0605);
                    return;
                }
                return;
            }
        }
        ((C0863) c1377.f4715).m1843(new C0245(c0605, true, z2));
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final void m1787(C0605 c0605) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c0605 != null) {
            while (c0605 != null && c0605.m1325() == 1) {
                if (!this.f3082) {
                    C0605 c0605M1356 = c0605.m1356();
                    if (c0605M1356 == null) {
                        break;
                    }
                    long j = ((C2935) c0605M1356.f2256.f8206).f983;
                    if (C3693.m6558(j) && C3693.m6549(j)) {
                        break;
                    }
                }
                c0605 = c0605.m1356();
            }
            if (c0605 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final int m1788(MotionEvent motionEvent) {
        Object obj;
        if (this.f3083) {
            this.f3083 = false;
            C3194 c3194 = getComposeViewContext().f18691;
            AbstractC4829.f15905.setValue(new C1444(motionEvent.getMetaState()));
        }
        C2500 c2500 = this.f3063;
        C3369 c3369M4645 = c2500.m4645(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        C4752 c4752 = this.f3091;
        if (c3369M4645 == null) {
            if (!c4752.f15687) {
                ((C0638) ((C3121) c4752.f15688).f10451).m1454();
                ((C3622) c4752.f15684).m6447();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) c3369M4645.f11255;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = arrayList.get(size);
            if (((C0284) obj).f1051 && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        C0284 c0284 = (C0284) obj;
        if (c0284 != null) {
            this.f3130 = c0284.f1056;
        }
        int iM8076 = c4752.m8076(c3369M4645, this, m1777(motionEvent));
        c3369M4645.f11254 = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM8076 & 1) != 0) {
            return iM8076;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c2500.f8306.delete(pointerId);
        c2500.f8309.delete(pointerId);
        return iM8076;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final boolean m1789() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m1790(C0605 c0605) {
        this.f3125.m2924(c0605, false);
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            m1790((C0605) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public final void m1791(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jM1798 = m1798((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM1798 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM1798 & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        this.f3091.m8076(this.f3063.m4645(motionEventObtain, this), this, true);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m1792(C0605 c0605, boolean z) {
        this.f3125.m2921(c0605, z);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m1793(C0605 c0605, long j) {
        C1377 c1377 = this.f3125;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c1377.m2932(c0605, j);
            if (!((C2808) c1377.f4712).m5354()) {
                c1377.m2925(false);
                getRectManager().m9138();
                if (this.f3064) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f3064 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦٖ */
    public final void m1794(InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        C4439 c4439;
        if (abstractC0772 instanceof C4439) {
            c4439 = (C4439) abstractC0772;
            int i = c4439.f14638;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4439.f14638 = i - Integer.MIN_VALUE;
            } else {
                c4439 = new C4439(this, abstractC0772);
            }
        } else {
            c4439 = new C4439(this, abstractC0772);
        }
        Object obj = c4439.f14637;
        int i2 = c4439.f14638;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C1264 c1264 = new C1264(this, 2);
            c4439.f14638 = 1;
            if (AbstractC4009.m7173(new C1734(c1264, this.f3090, interfaceC5731, null, 8), c4439) == EnumC2282.f7590) {
                return;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC0186.m409(obj);
        }
        C1078.m2274();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m1795(float[] fArr) {
        m1779();
        C0132.m290(fArr, this.f3078);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f3066 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f3066 & 4294967295L));
        float[] fArr2 = this.f3067;
        C0132.m294(fArr2);
        C0132.m291(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        C4773.m8139(fArr, fArr2);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m1796() {
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = this.f3129;
        viewOnAttachStateChangeListenerC2392.f7956 = true;
        Handler handler = viewOnAttachStateChangeListenerC2392.f7934.getHandler();
        if (viewOnAttachStateChangeListenerC2392.m4492() && !viewOnAttachStateChangeListenerC2392.f7930 && handler != null) {
            viewOnAttachStateChangeListenerC2392.f7930 = true;
            handler.post(viewOnAttachStateChangeListenerC2392.f7962);
        }
        ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316 = this.f3134;
        viewOnAttachStateChangeListenerC4316.f14268 = true;
        Handler handler2 = viewOnAttachStateChangeListenerC4316.f14275.getHandler();
        if (!viewOnAttachStateChangeListenerC4316.m7611() || viewOnAttachStateChangeListenerC4316.f14264 || handler2 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC4316.f14264 = true;
        handler2.post(viewOnAttachStateChangeListenerC4316.f14263);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX INFO: renamed from: ۦۗ */
    public final int m1797(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850;
        removeCallbacks(this.f3056);
        try {
            m1783(motionEvent);
            this.f3133 = true;
            m1781(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f3108;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                C4752 c4752 = this.f3091;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!c4752.f15687) {
                                ((C0638) ((C3121) c4752.f15688).f10451).m1454();
                                ((C3622) c4752.f15684).m6447();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z) {
                            motionEvent2 = motionEvent3;
                        } else {
                            m1791(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !m1777(motionEvent)) {
                    viewTreeObserverOnGlobalLayoutListenerC0850 = this;
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC0850 = this;
                    viewTreeObserverOnGlobalLayoutListenerC0850.m1791(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC0850.f3108;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC0850.f3108;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C2500 c2500 = viewTreeObserverOnGlobalLayoutListenerC0850.f3063;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c2500.f8306.delete(pointerId);
                            c2500.f8309.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC0850.f3108;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = viewTreeObserverOnGlobalLayoutListenerC0850.f3108;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = viewTreeObserverOnGlobalLayoutListenerC0850.f3108;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                c2500.f8306.delete(pointerId);
                                c2500.f8309.delete(pointerId);
                            }
                            C3622 c3622 = (C3622) c4752.f15684;
                            if (c3622.f12073) {
                                c3622.f12073 = true;
                            } else {
                                c3622.f12074.f9186.m1851();
                            }
                        }
                    }
                }
                viewTreeObserverOnGlobalLayoutListenerC0850.f3108 = MotionEvent.obtainNoHistory(motionEvent);
                int iM1788 = m1788(motionEvent);
                Trace.endSection();
                viewTreeObserverOnGlobalLayoutListenerC0850.f3133 = false;
                return iM1788;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f3133 = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final long m1798(long j) {
        m1779();
        long jM292 = C0132.m292(j, this.f3078);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f3066 >> 32)) + Float.intBitsToFloat((int) (jM292 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f3066 & 4294967295L)) + Float.intBitsToFloat((int) (jM292 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX INFO: renamed from: ۦۜ */
    public final void m1799() {
        boolean z;
        int i;
        int[] iArr = this.f3101;
        getLocationOnScreen(iArr);
        long j = this.f3060;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.f3110 >= 0) {
            z = false;
        } else {
            this.f3060 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                C0863 c0863M1329 = getRoot().m1329();
                Object[] objArr = c0863M1329.f3182;
                int i5 = c0863M1329.f3180;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((C0605) objArr[i6]).f2261.f4252.m4384();
                }
                z = true;
            }
        }
        m1779();
        View rootView = this.f19558;
        if (rootView == null) {
            rootView = getRootView();
            this.f19558 = rootView;
        }
        C5461 rectManager = getRectManager();
        long j2 = this.f3060;
        long jM8635 = C5063.m8635(this.f3066);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.f3078;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        C1545 c1545 = rectManager.f18003;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.f18005 = c1545.m3294(j2, jM8635, fArr, width, height) || rectManager.f18005;
        this.f3125.m2925(z);
        getRectManager().m9138();
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m1800(float f) {
        if (m1770()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f3132) || f > this.f3132) {
                    this.f3132 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f3120) || f < this.f3120) {
                    this.f3120 = f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public C0915 m9767getAccessibilityManager() {
        return this.f3076;
    }

    public C2471 getClipboard() {
        return this.f3102;
    }

    public C0761 getClipboardManager() {
        return this.f3085;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC1501 m9770getDragAndDropManager() {
        return this.f3065;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public C4912 m9771getLayoutNodes() {
        return this.f3111;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC5087
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m9764getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC5087
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public InterfaceC4892 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(InterfaceC3246 interfaceC3246) {
    }
}
