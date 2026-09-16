package p000;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: ۥًٞؓٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1937 {
    /* JADX INFO: renamed from: ۥؗ */
    public static void m3799(C1257 c1257) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c1257.f4324.f11452.toLanguageTags()));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C1257 m3800(Configuration configuration) {
        return C1257.m2656(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m3801(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m3802(Configuration configuration, C1257 c1257) {
        configuration.setLocales(LocaleList.forLanguageTags(c1257.f4324.f11452.toLanguageTags()));
    }
}
