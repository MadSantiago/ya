package p000;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: renamed from: ۦِٔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4204 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ThreadLocal f13963 = new ThreadLocal();

    /* JADX INFO: renamed from: ۥۗ */
    public static final long f13962 = m7427(0, 0);

    /* JADX INFO: renamed from: ۥۗ */
    public static final TextDirectionHeuristic m7426(int i) {
        if (i == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i != 4) {
            return i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final long m7427(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }
}
