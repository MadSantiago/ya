package p000;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: renamed from: ۦ٘ؔٛۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4431 {
    /* JADX INFO: renamed from: ۥۗ */
    public static String m7722(Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static boolean m7723(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }
}
