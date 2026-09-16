package p000;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: renamed from: ۦۦٞ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5796 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Paint f19096;

    /* JADX INFO: renamed from: ۥُ */
    public final int f19097;

    /* JADX INFO: renamed from: ۥّ */
    public final int f19098;

    /* JADX INFO: renamed from: ۥۗ */
    public final Paint f19099;

    /* JADX INFO: renamed from: ۥۜ */
    public final Paint f19100;

    /* JADX INFO: renamed from: ۥۣ */
    public final Paint f19101;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f19102;

    /* JADX INFO: renamed from: ۦۙ */
    public final Path f19103 = new Path();

    /* JADX INFO: renamed from: ۦٛ */
    public static final int[] f19094 = new int[3];

    /* JADX INFO: renamed from: ۦِ */
    public static final float[] f19093 = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: ۦۗ */
    public static final int[] f19095 = new int[4];

    /* JADX INFO: renamed from: ۦؚ */
    public static final float[] f19092 = {0.0f, 0.0f, 0.5f, 1.0f};

    public C5796() {
        Paint paint = new Paint();
        this.f19100 = paint;
        Paint paint2 = new Paint();
        this.f19101 = paint2;
        this.f19102 = AbstractC1373.m2912(-16777216, 68);
        this.f19097 = AbstractC1373.m2912(-16777216, 20);
        this.f19098 = AbstractC1373.m2912(-16777216, 0);
        paint2.setColor(this.f19102);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f19099 = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f19096 = new Paint(paint3);
    }
}
