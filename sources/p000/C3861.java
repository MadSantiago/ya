package p000;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: ۦَؚؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3861 extends AbstractC3019 implements InterfaceC0951 {

    /* JADX INFO: renamed from: ۥٕ */
    public final /* synthetic */ int f12893 = 1;

    /* JADX INFO: renamed from: ۥۙ */
    public final C2851 f12894;

    /* JADX INFO: renamed from: ۦؖ */
    public Object f12895;

    /* JADX INFO: renamed from: ۦؙ */
    public final C0585 f12896;

    public C3861(C2439 c2439, C2851 c2851, C0585 c0585, C1393 c1393) {
        this.f12894 = c2851;
        this.f12896 = c0585;
        this.f12895 = c1393;
        m5603(c2439);
    }

    /* JADX INFO: renamed from: ۥؐ */
    public static boolean m6894(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: ۦؕ */
    public static boolean m6895(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        boolean zM6895;
        long j;
        char c;
        boolean z;
        boolean zM6894;
        int i = this.f12893;
        C2851 c2851 = this.f12894;
        C0585 c0585 = this.f12896;
        switch (i) {
            case 0:
                C1393 c1393 = (C1393) this.f12895;
                C2004 c2004 = c2497.f8304;
                c2851.m5415(c2004.mo4567());
                if (C3291.m6051(c2004.mo4567())) {
                    c2497.m4644();
                    return;
                }
                c2497.m4644();
                c2851.f9524.getValue();
                InterfaceC3212 interfaceC3212M5353 = c2004.f6603.m5353();
                Canvas canvas = AbstractC5664.f18633;
                Canvas canvas2 = ((C0979) interfaceC3212M5353).f3447;
                if (C0585.m1291(c0585.f2180)) {
                    zM6895 = m6895(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c2004.mo4567() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(c2497.mo741(c1393.mo1102(c2497.getLayoutDirection())))) & 4294967295L), c0585.m1293(), canvas2);
                } else {
                    zM6895 = false;
                }
                if (C0585.m1291(c0585.f2184)) {
                    EdgeEffect edgeEffectM1294 = c0585.m1294();
                    zM6895 = m6895(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c2497.mo741(c1393.f4770))) & 4294967295L), edgeEffectM1294, canvas2) || zM6895;
                }
                if (C0585.m1291(c0585.f2188)) {
                    EdgeEffect edgeEffectM1297 = c0585.m1297();
                    zM6895 = m6895(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c2497.mo741(c1393.mo1101(c2497.getLayoutDirection())) + (-((float) AbstractC2776.m5235(Float.intBitsToFloat((int) (c2004.mo4567() >> 32))))))) & 4294967295L), edgeEffectM1297, canvas2) || zM6895;
                }
                if (C0585.m1291(c0585.f2179)) {
                    EdgeEffect edgeEffectM1295 = c0585.m1295();
                    float fMo741 = c2497.mo741(c1393.f4772);
                    zM6895 = m6895(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c2004.mo4567() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c2004.mo4567() & 4294967295L))) + fMo741)) & 4294967295L), edgeEffectM1295, canvas2) || zM6895;
                }
                if (zM6895) {
                    c2851.m5414();
                    return;
                }
                return;
            default:
                C2004 c2005 = c2497.f8304;
                c2851.m5415(c2005.mo4567());
                InterfaceC3212 interfaceC3212M5354 = c2005.f6603.m5353();
                Canvas canvas3 = AbstractC5664.f18633;
                Canvas canvas4 = ((C0979) interfaceC3212M5354).f3447;
                c2851.f9524.getValue();
                if (C3291.m6051(c2005.mo4567())) {
                    c2497.m4644();
                    return;
                }
                if (!canvas4.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = c0585.f2184;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = c0585.f2179;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = c0585.f2180;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = c0585.f2188;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = c0585.f2182;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = c0585.f2186;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = c0585.f2185;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = c0585.f2187;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    c2497.m4644();
                    return;
                }
                float fMo742 = c2497.mo741(30.0f);
                boolean z2 = C0585.m1291(c0585.f2184) || C0585.m1292(c0585.f2182) || C0585.m1291(c0585.f2179) || C0585.m1292(c0585.f2186);
                boolean z3 = C0585.m1291(c0585.f2180) || C0585.m1292(c0585.f2185) || C0585.m1291(c0585.f2188) || C0585.m1292(c0585.f2187);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    m6896().setPosition(0, 0, canvas4.getWidth(), canvas4.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        m6896().setPosition(0, 0, (AbstractC2776.m5235(fMo742) * 2) + canvas4.getWidth(), canvas4.getHeight());
                    } else {
                        if (!z3) {
                            c2497.m4644();
                            return;
                        }
                        m6896().setPosition(0, 0, canvas4.getWidth(), (AbstractC2776.m5235(fMo742) * 2) + canvas4.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = m6896().beginRecording();
                boolean zM1292 = C0585.m1292(c0585.f2185);
                EnumC1616 enumC1616 = EnumC1616.f5424;
                if (zM1292) {
                    EdgeEffect edgeEffectM1296 = c0585.f2185;
                    if (edgeEffectM1296 == null) {
                        edgeEffectM1296 = c0585.m1296(enumC1616);
                        c0585.f2185 = edgeEffectM1296;
                    }
                    m6894(90.0f, edgeEffectM1296, recordingCanvasBeginRecording);
                    edgeEffectM1296.finish();
                }
                if (C0585.m1291(c0585.f2180)) {
                    EdgeEffect edgeEffectM1293 = c0585.m1293();
                    zM6894 = m6894(270.0f, edgeEffectM1293, recordingCanvasBeginRecording);
                    if (C0585.m1292(c0585.f2180)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c2851.m5408() & j));
                        EdgeEffect edgeEffectM1298 = c0585.f2185;
                        if (edgeEffectM1298 == null) {
                            edgeEffectM1298 = c0585.m1296(enumC1616);
                            c0585.f2185 = edgeEffectM1298;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fM1707 = i2 >= 31 ? AbstractC0797.m1707(edgeEffectM1293) : 0.0f;
                        float f = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            AbstractC0797.m1708(edgeEffectM1298, fM1707, f);
                        } else {
                            edgeEffectM1298.onPull(fM1707, f);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zM6894 = false;
                }
                boolean zM1293 = C0585.m1292(c0585.f2182);
                EnumC1616 enumC1617 = EnumC1616.f5425;
                if (zM1293) {
                    EdgeEffect edgeEffectM1299 = c0585.f2182;
                    if (edgeEffectM1299 == null) {
                        edgeEffectM1299 = c0585.m1296(enumC1617);
                        c0585.f2182 = edgeEffectM1299;
                    }
                    m6894(180.0f, edgeEffectM1299, recordingCanvasBeginRecording);
                    edgeEffectM1299.finish();
                }
                if (C0585.m1291(c0585.f2184)) {
                    EdgeEffect edgeEffectM12910 = c0585.m1294();
                    zM6894 = m6894(0.0f, edgeEffectM12910, recordingCanvasBeginRecording) || zM6894;
                    if (C0585.m1292(c0585.f2184)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2851.m5408() >> c));
                        EdgeEffect edgeEffectM12911 = c0585.f2182;
                        if (edgeEffectM12911 == null) {
                            edgeEffectM12911 = c0585.m1296(enumC1617);
                            c0585.f2182 = edgeEffectM12911;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fM1708 = i3 >= 31 ? AbstractC0797.m1707(edgeEffectM12910) : 0.0f;
                        if (i3 >= 31) {
                            AbstractC0797.m1708(edgeEffectM12911, fM1708, fIntBitsToFloat2);
                        } else {
                            edgeEffectM12911.onPull(fM1708, fIntBitsToFloat2);
                        }
                    }
                }
                if (C0585.m1292(c0585.f2187)) {
                    EdgeEffect edgeEffectM12912 = c0585.f2187;
                    if (edgeEffectM12912 == null) {
                        edgeEffectM12912 = c0585.m1296(enumC1616);
                        c0585.f2187 = edgeEffectM12912;
                    }
                    m6894(270.0f, edgeEffectM12912, recordingCanvasBeginRecording);
                    edgeEffectM12912.finish();
                }
                if (C0585.m1291(c0585.f2188)) {
                    EdgeEffect edgeEffectM12913 = c0585.m1297();
                    zM6894 = m6894(90.0f, edgeEffectM12913, recordingCanvasBeginRecording) || zM6894;
                    if (C0585.m1292(c0585.f2188)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c2851.m5408() & j));
                        EdgeEffect edgeEffectM12914 = c0585.f2187;
                        if (edgeEffectM12914 == null) {
                            edgeEffectM12914 = c0585.m1296(enumC1616);
                            c0585.f2187 = edgeEffectM12914;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fM1709 = i4 >= 31 ? AbstractC0797.m1707(edgeEffectM12913) : 0.0f;
                        if (i4 >= 31) {
                            AbstractC0797.m1708(edgeEffectM12914, fM1709, fIntBitsToFloat3);
                        } else {
                            edgeEffectM12914.onPull(fM1709, fIntBitsToFloat3);
                        }
                    }
                }
                if (C0585.m1292(c0585.f2186)) {
                    EdgeEffect edgeEffectM12915 = c0585.f2186;
                    if (edgeEffectM12915 == null) {
                        edgeEffectM12915 = c0585.m1296(enumC1617);
                        c0585.f2186 = edgeEffectM12915;
                    }
                    m6894(0.0f, edgeEffectM12915, recordingCanvasBeginRecording);
                    edgeEffectM12915.finish();
                }
                if (C0585.m1291(c0585.f2179)) {
                    EdgeEffect edgeEffectM12916 = c0585.m1295();
                    boolean z4 = m6894(180.0f, edgeEffectM12916, recordingCanvasBeginRecording) || zM6894;
                    if (C0585.m1292(c0585.f2179)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c2851.m5408() >> c));
                        EdgeEffect edgeEffectM12917 = c0585.f2186;
                        if (edgeEffectM12917 == null) {
                            edgeEffectM12917 = c0585.m1296(enumC1617);
                            c0585.f2186 = edgeEffectM12917;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fM17010 = i5 >= 31 ? AbstractC0797.m1707(edgeEffectM12916) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            AbstractC0797.m1708(edgeEffectM12917, fM17010, f2);
                        } else {
                            edgeEffectM12917.onPull(fM17010, f2);
                        }
                    }
                    zM6894 = z4;
                }
                if (zM6894) {
                    c2851.m5414();
                }
                float f3 = z ? 0.0f : fMo742;
                float f4 = z2 ? 0.0f : fMo742;
                EnumC2459 layoutDirection = c2497.getLayoutDirection();
                C0979 c0979 = new C0979();
                c0979.f3447 = recordingCanvasBeginRecording;
                long jMo4567 = c2005.mo4567();
                C2808 c2808 = c2005.f6603;
                C2406 c2406 = ((C2004) c2808.f9377).f6604;
                InterfaceC2880 interfaceC2880 = c2406.f8016;
                EnumC2459 enumC2459 = c2406.f8015;
                InterfaceC3212 interfaceC3212M5355 = c2808.m5353();
                long jM5355 = c2005.f6603.m5355();
                C2808 c2809 = c2005.f6603;
                C4893 c4893 = (C4893) c2809.f9376;
                c2809.m5341(c2497);
                c2809.m5346(layoutDirection);
                c2809.m5356(c0979);
                c2809.m5351(jMo4567);
                c2809.f9376 = null;
                c0979.mo2092();
                try {
                    ((C5086) c2005.f6603.f9378).m8699(f3, f4);
                    try {
                        c2497.m4644();
                        float f5 = -f3;
                        float f6 = -f4;
                        ((C5086) c2005.f6603.f9378).m8699(f5, f6);
                        c0979.mo2095();
                        C2808 c28010 = c2005.f6603;
                        c28010.m5341(interfaceC2880);
                        c28010.m5346(enumC2459);
                        c28010.m5356(interfaceC3212M5355);
                        c28010.m5351(jM5355);
                        c28010.f9376 = c4893;
                        m6896().endRecording();
                        int iSave = canvas4.save();
                        canvas4.translate(f5, f6);
                        canvas4.drawRenderNode(m6896());
                        canvas4.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((C5086) c2005.f6603.f9378).m8699(-f3, -f4);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c0979.mo2095();
                    C2808 c28011 = c2005.f6603;
                    c28011.m5341(interfaceC2880);
                    c28011.m5346(enumC2459);
                    c28011.m5356(interfaceC3212M5355);
                    c28011.m5351(jM5355);
                    c28011.f9376 = c4893;
                    throw th2;
                }
        }
    }

    /* JADX INFO: renamed from: ۦ٘ */
    public RenderNode m6896() {
        RenderNode renderNode = (RenderNode) this.f12895;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM9548 = AbstractC5740.m9548();
        this.f12895 = renderNodeM9548;
        return renderNodeM9548;
    }

    public C3861(C2439 c2439, C2851 c2851, C0585 c0585) {
        this.f12894 = c2851;
        this.f12896 = c0585;
        m5603(c2439);
    }
}
