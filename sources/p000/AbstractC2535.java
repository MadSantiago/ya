package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۡؑؗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2535 extends ViewGroup implements InterfaceC1031, InterfaceC1263, InterfaceC3979, InterfaceC3662 {

    /* JADX INFO: renamed from: ۥؓ */
    public InterfaceC3983 f8392;

    /* JADX INFO: renamed from: ۥؔ */
    public boolean f8393;

    /* JADX INFO: renamed from: ۥؖ */
    public InterfaceC4507 f8394;

    /* JADX INFO: renamed from: ۥً */
    public long f8395;

    /* JADX INFO: renamed from: ۥَ */
    public boolean f8396;

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC2043 f8397;

    /* JADX INFO: renamed from: ۥٓ */
    public InterfaceC4448 f8398;

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC4745 f8399;

    /* JADX INFO: renamed from: ۥٖ */
    public InterfaceC4448 f8400;

    /* JADX INFO: renamed from: ۥٙ */
    public InterfaceC4745 f8401;

    /* JADX INFO: renamed from: ۥۖ */
    public InterfaceC4745 f8402;

    /* JADX INFO: renamed from: ۥۙ */
    public final C0737 f8403;

    /* JADX INFO: renamed from: ۥۦ */
    public final int[] f8404;

    /* JADX INFO: renamed from: ۥۧ */
    public final int[] f8405;

    /* JADX INFO: renamed from: ۦؖ */
    public InterfaceC4745 f8406;

    /* JADX INFO: renamed from: ۦؗ */
    public int f8407;

    /* JADX INFO: renamed from: ۦؙ */
    public final C0737 f8408;

    /* JADX INFO: renamed from: ۦُ */
    public int f8409;

    /* JADX INFO: renamed from: ۦٕ */
    public InterfaceC2880 f8410;

    /* JADX INFO: renamed from: ۦٖ */
    public final C2268 f8411;

    /* JADX INFO: renamed from: ۦٗ */
    public InterfaceC4448 f8412;

    /* JADX INFO: renamed from: ۦٚ */
    public C2639 f8413;

    /* JADX INFO: renamed from: ۦۛ */
    public InterfaceC0705 f8414;

    /* JADX INFO: renamed from: ۦۜ */
    public final C0605 f8415;

    /* JADX INFO: renamed from: ۦ۟ */
    public final View f8416;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3323 f8417;

    public AbstractC2535(Context context, AbstractC2109 abstractC2109, int i, C3323 c3323, View view, InterfaceC2043 interfaceC2043) {
        super(context);
        this.f8417 = c3323;
        this.f8416 = view;
        this.f8397 = interfaceC2043;
        if (abstractC2109 != null) {
            C3262 c3262 = AbstractC3937.f13146;
            setTag(R.id.androidx_compose_ui_view_composition_context, abstractC2109);
        }
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        C4855 c4855 = (C4855) this;
        C5315 c5315 = new C5315(c4855, i2);
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        C0460.m977(this, c5315);
        AbstractC5039.m8554(this, this);
        this.f8398 = C3218.f10776;
        this.f8400 = C3218.f10790;
        this.f8412 = C3218.f10773;
        C4217 c4217 = C4217.f13994;
        this.f8414 = c4217;
        this.f8410 = AbstractC4554.m7884();
        int i3 = 2;
        this.f8405 = new int[2];
        this.f8395 = 0L;
        int i4 = 1;
        this.f8403 = new C0737(c4855, i4);
        this.f8408 = new C0737(c4855, i2);
        this.f8404 = new int[2];
        this.f8407 = Integer.MIN_VALUE;
        this.f8409 = Integer.MIN_VALUE;
        this.f8411 = new C2268(2, (byte) 0);
        C0605 c0605 = new C0605(3);
        c0605.f2240 = c4855;
        InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(AbstractC3933.m7079(c4217, AbstractC5537.f18285, c3323), true, C1931.f6374);
        C2317 c2317 = new C2317();
        c2317.f7659 = new C5157(c4855, i3);
        C5757 c5757 = new C5757();
        C5757 c5758 = c2317.f7658;
        if (c5758 != null) {
            c5758.f18973 = null;
        }
        c2317.f7658 = c5757;
        c5757.f18973 = c2317;
        setOnRequestDisallowInterceptTouchEvent$ui(c5757);
        InterfaceC0705 interfaceC0705Mo1571 = AbstractC2164.m4198(AbstractC1434.m3037(interfaceC0705M3510.mo1571(c2317), new C5583(c4855, c0605, c4855)), new C5625(c4855, c0605, i3)).mo1571(new C1872(new C5157(c4855, i4)));
        c0605.m1333(this.f8414.mo1571(interfaceC0705Mo1571));
        int i5 = 5;
        this.f8402 = new C5544(i5, c0605, interfaceC0705Mo1571);
        c0605.m1341(this.f8410);
        this.f8401 = new C2932(i5, c0605);
        c0605.f2276 = new C5625(c4855, c0605, i2);
        c0605.f2257 = new C5157(c4855, i2);
        c0605.m1322(new C5279(c4855, c0605));
        this.f8415 = c0605;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1775 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC3480.m6278("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0850) this.f8397).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static int m4763(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(AbstractC4554.m7934(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static C5364 m4765(C5364 c5364, int i, int i2, int i3, int i4) {
        int i5 = c5364.f17695 - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = c5364.f17694 - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = c5364.f17693 - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = c5364.f17696 - i4;
        return C5364.m9014(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f8404;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC2880 getDensity() {
        return this.f8410;
    }

    public final View getInteropView() {
        return this.f8416;
    }

    public final C0605 getLayoutNode() {
        return this.f8415;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f8416.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC4507 getLifecycleOwner() {
        return this.f8394;
    }

    public final InterfaceC0705 getModifier() {
        return this.f8414;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2268 c2268 = this.f8411;
        return c2268.f7526 | c2268.f7527;
    }

    public final InterfaceC4745 getOnDensityChanged$ui() {
        return this.f8401;
    }

    public final InterfaceC4745 getOnModifierChanged$ui() {
        return this.f8402;
    }

    public final InterfaceC4745 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f8406;
    }

    public final InterfaceC4448 getRelease() {
        return this.f8412;
    }

    public final InterfaceC4448 getReset() {
        return this.f8400;
    }

    public final InterfaceC3983 getSavedStateRegistryOwner() {
        return this.f8392;
    }

    public final InterfaceC4448 getUpdate() {
        return this.f8398;
    }

    public final View getView() {
        return this.f8416;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f8393) {
            this.f8415.m1319();
            return null;
        }
        this.f8416.postOnAnimation(new RunnableC1056(3, this.f8408));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f8416.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8403.mo449();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f8393) {
            this.f8415.m1319();
        } else {
            this.f8416.postOnAnimation(new RunnableC1056(3, this.f8408));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: all -> 0x0096, LOOP:1: B:14:0x0035->B:25:0x007b, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:8:0x0018, B:26:0x0080, B:28:0x0088, B:33:0x0098, B:30:0x008d, B:11:0x0029, B:14:0x0035, B:16:0x004a, B:18:0x0056, B:20:0x0060, B:22:0x0070, B:25:0x007b, B:34:0x009c), top: B:39:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[EDGE_INSN: B:46:0x0080->B:26:0x0080 BREAK  A[LOOP:1: B:14:0x0035->B:25:0x007b], SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i;
        super.onDetachedFromWindow();
        C5389 c5389 = getSnapshotObserver().f5926;
        synchronized (c5389.f17819) {
            try {
                C0863 c0863 = c5389.f17812;
                int i2 = c0863.f3180;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = c0863.f3182;
                    if (i3 < i2) {
                        C5471 c5471 = (C5471) objArr[i3];
                        C1254 c1254 = (C1254) c5471.f18040.m6026(this);
                        if (c1254 == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = c1254.f4318;
                            int[] iArr = c1254.f4315;
                            long[] jArr = c1254.f4319;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i5 != length) {
                                            break;
                                            break;
                                        } else {
                                            i5++;
                                            i3 = i;
                                        }
                                    } else {
                                        int i6 = 8;
                                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i5 << 3) + i8;
                                                Object obj = objArr2[i9];
                                                int i10 = iArr[i9];
                                                c5471.m9163(this, obj);
                                            }
                                            j >>= i6;
                                            i8++;
                                            i6 = i6;
                                        }
                                        if (i7 != i6) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!c5471.f18040.m6024()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = c0863.f3182;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i11 = i2 - i4;
                        Arrays.fill(objArr, i11, i2, (Object) null);
                        c0863.f3180 = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f8416.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f8416;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f8407 = i;
        this.f8409 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f8416.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC2765.m5135(this.f8417.m6097(), null, 0, new C4890(z, this, AbstractC3933.m7091(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f8416.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC2765.m5135(this.f8417.m6097(), null, 0, new C2079(this, AbstractC3933.m7091(f * (-1.0f), f2 * (-1.0f)), (InterfaceC0443) null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        InterfaceC4745 interfaceC4745 = this.f8399;
        if (interfaceC4745 == null) {
            return true;
        }
        interfaceC4745.mo211(rect != null ? AbstractC4225.m7460(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        InterfaceC4745 interfaceC4745 = this.f8406;
        if (interfaceC4745 != null) {
            interfaceC4745.mo211(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC2880 interfaceC2880) {
        if (interfaceC2880 != this.f8410) {
            this.f8410 = interfaceC2880;
            InterfaceC4745 interfaceC4745 = this.f8401;
            if (interfaceC4745 != null) {
                interfaceC4745.mo211(interfaceC2880);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC4507 interfaceC4507) {
        if (interfaceC4507 != this.f8394) {
            this.f8394 = interfaceC4507;
            setTag(R.id.view_tree_lifecycle_owner, interfaceC4507);
        }
    }

    public final void setModifier(InterfaceC0705 interfaceC0705) {
        if (interfaceC0705 != this.f8414) {
            this.f8414 = interfaceC0705;
            InterfaceC4745 interfaceC4745 = this.f8402;
            if (interfaceC4745 != null) {
                interfaceC4745.mo211(interfaceC0705);
            }
        }
    }

    public final void setOnDensityChanged$ui(InterfaceC4745 interfaceC4745) {
        this.f8401 = interfaceC4745;
    }

    public final void setOnModifierChanged$ui(InterfaceC4745 interfaceC4745) {
        this.f8402 = interfaceC4745;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(InterfaceC4745 interfaceC4745) {
        this.f8406 = interfaceC4745;
    }

    public final void setRelease(InterfaceC4448 interfaceC4448) {
        this.f8412 = interfaceC4448;
    }

    public final void setReset(InterfaceC4448 interfaceC4448) {
        this.f8400 = interfaceC4448;
    }

    public final void setSavedStateRegistryOwner(InterfaceC3983 interfaceC3983) {
        if (interfaceC3983 != this.f8392) {
            this.f8392 = interfaceC3983;
            setTag(R.id.view_tree_saved_state_registry_owner, interfaceC3983);
        }
    }

    public final void setUpdate(InterfaceC4448 interfaceC4448) {
        this.f8398 = interfaceC4448;
        this.f8396 = true;
        this.f8403.mo449();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // p000.InterfaceC3979
    /* JADX INFO: renamed from: ۥؓ */
    public final boolean mo1315() {
        return isAttachedToWindow();
    }

    @Override // p000.InterfaceC1031
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo17(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f8416.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            C1386 c1386 = this.f8417.f11134;
            C1386 c1386M2944 = c1386 != null ? c1386.m2944() : null;
            long jMo2943 = c1386M2944 != null ? c1386M2944.mo2943(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = AbstractC2776.m5235(Float.intBitsToFloat((int) (jMo2943 >> 32))) * (-1);
            iArr[1] = AbstractC2776.m5235(Float.intBitsToFloat((int) (jMo2943 & 4294967295L))) * (-1);
        }
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۥُ */
    public final void mo18(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (this.f8416.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            C1386 c1386 = this.f8417.f11134;
            C1386 c1386M2944 = c1386 != null ? c1386.m2944() : null;
            if (c1386M2944 != null) {
                c1386M2944.mo2943(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // p000.InterfaceC1263
    /* JADX INFO: renamed from: ۥّ */
    public final void mo1323() {
        this.f8412.mo449();
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo19(View view, int i) {
        C2268 c2268 = this.f8411;
        if (i == 1) {
            c2268.f7526 = 0;
        } else {
            c2268.f7527 = 0;
        }
    }

    @Override // p000.InterfaceC1263
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo1335() {
        this.f8400.mo449();
        removeAllViewsInLayout();
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo21(View view, View view2, int i, int i2) {
        C2268 c2268 = this.f8411;
        if (i2 == 1) {
            c2268.f7526 = i;
        } else {
            c2268.f7527 = i;
        }
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo22(int i, int i2, int[] iArr, int i3) {
        if (this.f8416.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            C1386 c1386 = this.f8417.f11134;
            C1386 c1386M2944 = c1386 != null ? c1386.m2944() : null;
            long jMo2946 = c1386M2944 != null ? c1386M2944.mo2946(jFloatToRawIntBits, i4) : 0L;
            iArr[0] = AbstractC2776.m5235(Float.intBitsToFloat((int) (jMo2946 >> 32))) * (-1);
            iArr[1] = AbstractC2776.m5235(Float.intBitsToFloat((int) (jMo2946 & 4294967295L))) * (-1);
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final C2639 m4766(C2639 c2639) {
        C3470 c3470 = c2639.f8768;
        C5364 c5364Mo2752 = c3470.mo2752(-1);
        C5364 c5364 = C5364.f17692;
        if (!c5364Mo2752.equals(c5364) || !c3470.mo2749(-9).equals(c5364) || c3470.mo6259() != null) {
            C2935 c2935 = (C2935) this.f8415.f2256.f8206;
            if (c2935.f9864.f17786) {
                long jM8635 = C5063.m8635(c2935.mo2808(0L));
                int i = (int) (jM8635 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jM8635 & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jMo2799 = C4773.m8145(c2935).mo2799();
                int i3 = (int) (jMo2799 >> 32);
                int i4 = (int) (jMo2799 & 4294967295L);
                long j = c2935.f982;
                long jM8636 = C5063.m8635(c2935.mo2808((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jM8636 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jM8636));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return c2639.f8768.mo2741(i, i2, i5, i7);
                }
            }
        }
        return c2639;
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۦٛ */
    public final boolean mo25(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // p000.InterfaceC3662
    /* JADX INFO: renamed from: ۦۙ */
    public final C2639 mo284(View view, C2639 c2639) {
        this.f8413 = new C2639(c2639);
        return m4766(c2639);
    }
}
