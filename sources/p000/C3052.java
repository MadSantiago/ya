package p000;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: renamed from: ۦؘٟؑؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3052 extends View {

    /* JADX INFO: renamed from: ۥٙ */
    public static final C1693 f10278 = new C1693(3);

    /* JADX INFO: renamed from: ۥَ */
    public Outline f10279;

    /* JADX INFO: renamed from: ۥْ */
    public final C2004 f10280;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f10281;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f10282;

    /* JADX INFO: renamed from: ۥۖ */
    public InterfaceC4745 f10283;

    /* JADX INFO: renamed from: ۦٕ */
    public C4893 f10284;

    /* JADX INFO: renamed from: ۦٗ */
    public InterfaceC2880 f10285;

    /* JADX INFO: renamed from: ۦۛ */
    public EnumC2459 f10286;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3379 f10287;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC2717 f10288;

    public C3052(AbstractC2717 abstractC2717, C3379 c3379, C2004 c2004) {
        super(abstractC2717.getContext());
        this.f10288 = abstractC2717;
        this.f10287 = c3379;
        this.f10280 = c2004;
        setOutlineProvider(f10278);
        this.f10282 = true;
        this.f10285 = AbstractC0186.f684;
        this.f10286 = EnumC2459.f8215;
        InterfaceC3053.f10289.getClass();
        this.f10283 = C1931.f6369;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C3379 c3379 = this.f10287;
        C0979 c0979 = c3379.f11267;
        Canvas canvas2 = c0979.f3447;
        c0979.f3447 = canvas;
        InterfaceC2880 interfaceC2880 = this.f10285;
        EnumC2459 enumC2459 = this.f10286;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C4893 c4893 = this.f10284;
        InterfaceC4745 interfaceC4745 = this.f10283;
        C2004 c2004 = this.f10280;
        C2808 c2808 = c2004.f6603;
        C2406 c2406 = ((C2004) c2808.f9377).f6604;
        InterfaceC2880 interfaceC2881 = c2406.f8016;
        EnumC2459 enumC24510 = c2406.f8015;
        InterfaceC3212 interfaceC3212M5353 = c2808.m5353();
        C2808 c2809 = c2004.f6603;
        long jM5355 = c2809.m5355();
        C4893 c4894 = (C4893) c2809.f9376;
        c2809.m5341(interfaceC2880);
        c2809.m5346(enumC2459);
        c2809.m5356(c0979);
        c2809.m5351(jFloatToRawIntBits);
        c2809.f9376 = c4893;
        c0979.mo2092();
        try {
            interfaceC4745.mo211(c2004);
            c0979.mo2095();
            c2809.m5341(interfaceC2881);
            c2809.m5346(enumC24510);
            c2809.m5356(interfaceC3212M5353);
            c2809.m5351(jM5355);
            c2809.f9376 = c4894;
            c3379.f11267.f3447 = canvas2;
            this.f10281 = false;
        } catch (Throwable th) {
            c0979.mo2095();
            c2809.m5341(interfaceC2881);
            c2809.m5346(enumC24510);
            c2809.m5356(interfaceC3212M5353);
            c2809.m5351(jM5355);
            c2809.f9376 = c4894;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f10282;
    }

    public final C3379 getCanvasHolder() {
        return this.f10287;
    }

    public final View getOwnerView() {
        return this.f10288;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f10282;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f10281) {
            return;
        }
        this.f10281 = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f10282 != z) {
            this.f10282 = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.f10281 = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
