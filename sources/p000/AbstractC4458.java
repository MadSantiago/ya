package p000;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: ۦ٘ٙٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4458 {
    /* JADX INFO: renamed from: ۥۗ */
    public static void m7740(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static LocaleList m7741(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
