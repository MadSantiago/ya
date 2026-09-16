package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: ۥَؗؑۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0585 {

    /* JADX INFO: renamed from: ۥؗ */
    public long f2178 = 0;

    /* JADX INFO: renamed from: ۥُ */
    public EdgeEffect f2179;

    /* JADX INFO: renamed from: ۥّ */
    public EdgeEffect f2180;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f2181;

    /* JADX INFO: renamed from: ۥۜ */
    public EdgeEffect f2182;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f2183;

    /* JADX INFO: renamed from: ۦؑ */
    public EdgeEffect f2184;

    /* JADX INFO: renamed from: ۦِ */
    public EdgeEffect f2185;

    /* JADX INFO: renamed from: ۦٛ */
    public EdgeEffect f2186;

    /* JADX INFO: renamed from: ۦۗ */
    public EdgeEffect f2187;

    /* JADX INFO: renamed from: ۦۙ */
    public EdgeEffect f2188;

    public C0585(Context context, int i) {
        this.f2183 = context;
        this.f2181 = i;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static boolean m1291(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static boolean m1292(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC0797.m1707(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final EdgeEffect m1293() {
        EdgeEffect edgeEffect = this.f2180;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1296 = m1296(EnumC1616.f5424);
        this.f2180 = edgeEffectM1296;
        return edgeEffectM1296;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final EdgeEffect m1294() {
        EdgeEffect edgeEffect = this.f2184;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1296 = m1296(EnumC1616.f5425);
        this.f2184 = edgeEffectM1296;
        return edgeEffectM1296;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final EdgeEffect m1295() {
        EdgeEffect edgeEffect = this.f2179;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1296 = m1296(EnumC1616.f5425);
        this.f2179 = edgeEffectM1296;
        return edgeEffectM1296;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final EdgeEffect m1296(EnumC1616 enumC1616) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f2183;
        EdgeEffect edgeEffectM1706 = i >= 31 ? AbstractC0797.m1706(context) : new C0626(context);
        edgeEffectM1706.setColor(this.f2181);
        if (!C4207.m7431(this.f2178, 0L)) {
            long j = this.f2178;
            if (enumC1616 == EnumC1616.f5425) {
                edgeEffectM1706.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectM1706;
            }
            edgeEffectM1706.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectM1706;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final EdgeEffect m1297() {
        EdgeEffect edgeEffect = this.f2188;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1296 = m1296(EnumC1616.f5424);
        this.f2188 = edgeEffectM1296;
        return edgeEffectM1296;
    }
}
