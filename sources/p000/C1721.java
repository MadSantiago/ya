package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: renamed from: ۥؚٚؔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1721 implements InterfaceC3053 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2004 f5726;

    /* JADX INFO: renamed from: ۥَ */
    public boolean f5727;

    /* JADX INFO: renamed from: ۥُ */
    public long f5728;

    /* JADX INFO: renamed from: ۥّ */
    public Paint f5729;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f5730;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f5731;

    /* JADX INFO: renamed from: ۥٖ */
    public int f5732;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3379 f5733;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f5734;

    /* JADX INFO: renamed from: ۦؑ */
    public final RenderNode f5735;

    /* JADX INFO: renamed from: ۦؚ */
    public float f5736;

    /* JADX INFO: renamed from: ۦٌ */
    public float f5737;

    /* JADX INFO: renamed from: ۦِ */
    public int f5738;

    /* JADX INFO: renamed from: ۦٛ */
    public float f5739;

    /* JADX INFO: renamed from: ۦۗ */
    public float f5740;

    /* JADX INFO: renamed from: ۦۙ */
    public Matrix f5741;

    /* JADX INFO: renamed from: ۦۚ */
    public long f5742;

    /* JADX INFO: renamed from: ۦ۟ */
    public float f5743;

    /* JADX INFO: renamed from: ۦۨ */
    public long f5744;

    public C1721() {
        C3379 c3379 = new C3379();
        C2004 c2004 = new C2004();
        this.f5733 = c3379;
        this.f5726 = c2004;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f5735 = renderNode;
        this.f5728 = 0L;
        renderNode.setClipToBounds(false);
        m3541(renderNode, 0);
        this.f5739 = 1.0f;
        this.f5738 = 3;
        this.f5740 = 1.0f;
        this.f5736 = 1.0f;
        long j = C1327.f4588;
        this.f5742 = j;
        this.f5744 = j;
        this.f5743 = 8.0f;
        this.f5732 = 0;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo1191(long j) {
        this.f5744 = j;
        this.f5735.setSpotShadowColor(AbstractC4225.m7470(j));
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؔ */
    public final long mo1192() {
        return this.f5742;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؖ */
    public final void mo1193() {
        this.f5735.setRotationZ(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1194(float f) {
        this.f5739 = f;
        this.f5735.setAlpha(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥً */
    public final Matrix mo1195() {
        Matrix matrix = this.f5741;
        if (matrix == null) {
            matrix = new Matrix();
            this.f5741 = matrix;
        }
        this.f5735.getMatrix(matrix);
        return matrix;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥَ */
    public final void mo1196(InterfaceC3212 interfaceC3212) {
        Canvas canvas = AbstractC5664.f18633;
        ((C0979) interfaceC3212).f3447.drawRenderNode(this.f5735);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥُ */
    public final void mo1197(float f) {
        this.f5737 = f;
        this.f5735.setElevation(f);
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
        this.f5735.setTranslationX(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٕ */
    public final float mo1201() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo1202(boolean z) {
        this.f5730 = z;
        m3540();
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m3538() {
        int i = this.f5732;
        if (i != 1 && this.f5738 == 3) {
            m3541(this.f5735, i);
        } else {
            m3541(this.f5735, 1);
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٙ */
    public final void mo1203(int i) {
        this.f5732 = i;
        m3538();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۖ */
    public final void mo1204(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459, C4893 c4893, C2932 c2932) {
        C2004 c2004 = this.f5726;
        RecordingCanvas recordingCanvasBeginRecording = this.f5735.beginRecording();
        try {
            C3379 c3379 = this.f5733;
            C0979 c0979 = c3379.f11267;
            Canvas canvas = c0979.f3447;
            c0979.f3447 = recordingCanvasBeginRecording;
            C2808 c2808 = c2004.f6603;
            c2808.m5341(interfaceC2880);
            c2808.m5346(enumC2459);
            c2808.f9376 = c4893;
            c2808.m5351(this.f5728);
            c2808.m5356(c0979);
            c2932.mo211(c2004);
            c3379.f11267.f3447 = canvas;
        } finally {
            this.f5735.endRecording();
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1205() {
        this.f5735.setRotationX(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۙ */
    public final void mo1206(float f) {
        this.f5743 = f;
        this.f5735.setCameraDistance(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo1207() {
        this.f5735.setRotationY(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo1208() {
        return this.f5739;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۦ */
    public final float mo1209() {
        return this.f5736;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo1210(float f) {
        this.f5736 = f;
        this.f5735.setScaleY(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1211() {
        return this.f5740;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؖ */
    public final boolean mo3539() {
        return this.f5735.hasDisplayList();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؗ */
    public final float mo1212() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؙ */
    public final float mo1213() {
        return this.f5737;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo1214() {
        Paint paint = this.f5729;
        if (paint == null) {
            paint = new Paint();
            this.f5729 = paint;
        }
        paint.setColorFilter(null);
        m3538();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo1215(float f) {
        this.f5740 = f;
        this.f5735.setScaleX(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦُ */
    public final int mo1216() {
        return this.f5738;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦِ */
    public final void mo1217(long j) {
        this.f5742 = j;
        this.f5735.setAmbientShadowColor(AbstractC4225.m7470(j));
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٕ */
    public final C1516 mo1218() {
        return null;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo1219(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.f5735;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f5735.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٗ */
    public final int mo1220() {
        return this.f5732;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٚ */
    public final void mo1221(int i, int i2, long j) {
        this.f5735.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.f5728 = AbstractC5537.m9235(j);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٛ */
    public final long mo1222() {
        return this.f5744;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo1223(Outline outline, long j) {
        this.f5735.setOutline(outline);
        this.f5734 = outline != null;
        m3540();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo1224() {
        this.f5735.setTranslationY(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo1225(int i) {
        this.f5738 = i;
        Paint paint = this.f5729;
        if (paint == null) {
            paint = new Paint();
            this.f5729 = paint;
        }
        paint.setBlendMode(AbstractC3801.m6799(i));
        m3538();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۛ */
    public final float mo1226() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m3540() {
        boolean z = this.f5730;
        boolean z2 = false;
        boolean z3 = z && !this.f5734;
        if (z && this.f5734) {
            z2 = true;
        }
        if (z3 != this.f5731) {
            this.f5731 = z3;
            this.f5735.setClipToBounds(z3);
        }
        if (z2 != this.f5727) {
            this.f5727 = z2;
            this.f5735.setClipToOutline(z2);
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1228() {
        this.f5735.discardDisplayList();
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m3541(RenderNode renderNode, int i) {
        Paint paint = this.f5729;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۨ */
    public final float mo1230() {
        return this.f5743;
    }
}
