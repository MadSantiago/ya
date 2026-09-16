package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥِۨؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2906 implements InterfaceC3053 {

    /* JADX INFO: renamed from: ۥۖ */
    public static final AtomicBoolean f9673 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ۥؗ */
    public final C2004 f9674;

    /* JADX INFO: renamed from: ۥَ */
    public float f9675;

    /* JADX INFO: renamed from: ۥُ */
    public long f9676;

    /* JADX INFO: renamed from: ۥّ */
    public Paint f9677;

    /* JADX INFO: renamed from: ۥْ */
    public long f9678;

    /* JADX INFO: renamed from: ۥٓ */
    public long f9679;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f9680;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3379 f9681;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f9682;

    /* JADX INFO: renamed from: ۦؑ */
    public final RenderNode f9683;

    /* JADX INFO: renamed from: ۦؚ */
    public float f9684;

    /* JADX INFO: renamed from: ۦٌ */
    public boolean f9685;

    /* JADX INFO: renamed from: ۦِ */
    public int f9686;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f9687;

    /* JADX INFO: renamed from: ۦٛ */
    public long f9688;

    /* JADX INFO: renamed from: ۦۗ */
    public int f9689;

    /* JADX INFO: renamed from: ۦۙ */
    public Matrix f9690;

    /* JADX INFO: renamed from: ۦۚ */
    public float f9691;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f9692;

    /* JADX INFO: renamed from: ۦ۟ */
    public float f9693;

    /* JADX INFO: renamed from: ۦۨ */
    public float f9694;

    public C2906(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C3379 c3379, C2004 c2004) {
        this.f9681 = c3379;
        this.f9674 = c2004;
        RenderNode renderNodeCreate = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC0850);
        this.f9683 = renderNodeCreate;
        this.f9676 = 0L;
        this.f9688 = 0L;
        if (f9673.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC0680.m1512(renderNodeCreate, AbstractC0680.m1514(renderNodeCreate));
                AbstractC0680.m1515(renderNodeCreate, AbstractC0680.m1513(renderNodeCreate));
            }
            AbstractC0290.m613(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m5479(0);
        this.f9686 = 0;
        this.f9689 = 3;
        this.f9684 = 1.0f;
        this.f9691 = 1.0f;
        this.f9694 = 1.0f;
        long j = C1327.f4588;
        this.f9678 = j;
        this.f9679 = j;
        this.f9675 = 8.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo1191(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9679 = j;
            AbstractC0680.m1515(this.f9683, AbstractC4225.m7470(j));
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؔ */
    public final long mo1192() {
        return this.f9678;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؖ */
    public final void mo1193() {
        this.f9683.setRotation(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1194(float f) {
        this.f9684 = f;
        this.f9683.setAlpha(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥً */
    public final Matrix mo1195() {
        Matrix matrix = this.f9690;
        if (matrix == null) {
            matrix = new Matrix();
            this.f9690 = matrix;
        }
        this.f9683.getMatrix(matrix);
        return matrix;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥَ */
    public final void mo1196(InterfaceC3212 interfaceC3212) {
        Canvas canvas = AbstractC5664.f18633;
        ((C0979) interfaceC3212).f3447.drawRenderNode(this.f9683);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥُ */
    public final void mo1197(float f) {
        this.f9693 = f;
        this.f9683.setElevation(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥّ */
    public final float mo1198() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥْ */
    public final float mo1199() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo1200() {
        this.f9683.setTranslationX(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٕ */
    public final float mo1201() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo1202(boolean z) {
        this.f9680 = z;
        m5478();
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m5477() {
        int i = this.f9686;
        if (i != 1 && this.f9689 == 3) {
            m5479(i);
        } else {
            m5479(1);
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٙ */
    public final void mo1203(int i) {
        this.f9686 = i;
        m5477();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۖ */
    public final void mo1204(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459, C4893 c4893, C2932 c2932) {
        Canvas canvasStart = this.f9683.start(Math.max((int) (this.f9676 >> 32), (int) (this.f9688 >> 32)), Math.max((int) (this.f9676 & 4294967295L), (int) (this.f9688 & 4294967295L)));
        try {
            C0979 c0979 = this.f9681.f11267;
            Canvas canvas = c0979.f3447;
            c0979.f3447 = canvasStart;
            C2004 c2004 = this.f9674;
            C2808 c2808 = c2004.f6603;
            long jM9235 = AbstractC5537.m9235(this.f9676);
            C2406 c2406 = ((C2004) c2808.f9377).f6604;
            InterfaceC2880 interfaceC2881 = c2406.f8016;
            EnumC2459 enumC24510 = c2406.f8015;
            InterfaceC3212 interfaceC3212M5353 = c2808.m5353();
            long jM5355 = c2808.m5355();
            C4893 c4894 = (C4893) c2808.f9376;
            c2808.m5341(interfaceC2880);
            c2808.m5346(enumC2459);
            c2808.m5356(c0979);
            c2808.m5351(jM9235);
            c2808.f9376 = c4893;
            c0979.mo2092();
            try {
                c2932.mo211(c2004);
                c0979.mo2095();
                c2808.m5341(interfaceC2881);
                c2808.m5346(enumC24510);
                c2808.m5356(interfaceC3212M5353);
                c2808.m5351(jM5355);
                c2808.f9376 = c4894;
                c0979.f3447 = canvas;
                this.f9683.end(canvasStart);
            } catch (Throwable th) {
                c0979.mo2095();
                C2808 c2809 = c2004.f6603;
                c2809.m5341(interfaceC2881);
                c2809.m5346(enumC24510);
                c2809.m5356(interfaceC3212M5353);
                c2809.m5351(jM5355);
                c2809.f9376 = c4894;
                throw th;
            }
        } catch (Throwable th2) {
            this.f9683.end(canvasStart);
            throw th2;
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1205() {
        this.f9683.setRotationX(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۙ */
    public final void mo1206(float f) {
        this.f9675 = f;
        this.f9683.setCameraDistance(-f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo1207() {
        this.f9683.setRotationY(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo1208() {
        return this.f9684;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۦ */
    public final float mo1209() {
        return this.f9694;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo1210(float f) {
        this.f9694 = f;
        this.f9683.setScaleY(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1211() {
        return this.f9691;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؖ */
    public final boolean mo3539() {
        return this.f9683.isValid();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؗ */
    public final float mo1212() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؙ */
    public final float mo1213() {
        return this.f9693;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo1214() {
        m5477();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo1215(float f) {
        this.f9691 = f;
        this.f9683.setScaleX(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦُ */
    public final int mo1216() {
        return this.f9689;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦِ */
    public final void mo1217(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9678 = j;
            AbstractC0680.m1512(this.f9683, AbstractC4225.m7470(j));
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٕ */
    public final C1516 mo1218() {
        return null;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo1219(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f9685 = true;
            this.f9683.setPivotX(((int) (this.f9676 >> 32)) / 2.0f);
            this.f9683.setPivotY(((int) (4294967295L & this.f9676)) / 2.0f);
        } else {
            this.f9685 = false;
            this.f9683.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f9683.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٗ */
    public final int mo1220() {
        return this.f9686;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٚ */
    public final void mo1221(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.f9683.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (C4207.m7431(this.f9676, j)) {
            return;
        }
        if (this.f9685) {
            this.f9683.setPivotX(i3 / 2.0f);
            this.f9683.setPivotY(i4 / 2.0f);
        }
        this.f9676 = j;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٛ */
    public final long mo1222() {
        return this.f9679;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo1223(Outline outline, long j) {
        this.f9688 = j;
        this.f9683.setOutline(outline);
        this.f9682 = outline != null;
        m5478();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo1224() {
        this.f9683.setTranslationY(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo1225(int i) {
        if (this.f9689 == i) {
            return;
        }
        this.f9689 = i;
        Paint paint = this.f9677;
        if (paint == null) {
            paint = new Paint();
            this.f9677 = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC3801.m6797(i)));
        m5477();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۛ */
    public final float mo1226() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m5478() {
        boolean z = this.f9680;
        boolean z2 = false;
        boolean z3 = z && !this.f9682;
        if (z && this.f9682) {
            z2 = true;
        }
        if (z3 != this.f9687) {
            this.f9687 = z3;
            this.f9683.setClipToBounds(z3);
        }
        if (z2 != this.f9692) {
            this.f9692 = z2;
            this.f9683.setClipToOutline(z2);
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1228() {
        AbstractC0290.m613(this.f9683);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m5479(int i) {
        RenderNode renderNode = this.f9683;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f9677);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f9677);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f9677);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۨ */
    public final float mo1230() {
        return this.f9675;
    }
}
