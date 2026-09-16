package p000;

import android.graphics.Paint;

/* JADX INFO: renamed from: ۥٗؒٗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1514 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ int[] f5148;

    /* JADX INFO: renamed from: ۥۣ */
    public static final /* synthetic */ int[] f5149;

    static {
        try {
            new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        int[] iArr = new int[Paint.Cap.values().length];
        try {
            iArr[Paint.Cap.BUTT.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Paint.Cap.ROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Paint.Cap.SQUARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f5149 = iArr;
        int[] iArr2 = new int[Paint.Join.values().length];
        try {
            iArr2[Paint.Join.MITER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Paint.Join.BEVEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Paint.Join.ROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f5148 = iArr2;
    }
}
