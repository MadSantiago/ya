package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: ۥٓؒٞۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1257 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1257 f4323 = new C1257(new C3446(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: ۥۣ */
    public final C3446 f4324;

    public C1257(C3446 c3446) {
        this.f4324 = c3446;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C1257 m2656(String str) {
        if (str == null || str.isEmpty()) {
            return f4323;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new C1257(new C3446(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1257) {
            return this.f4324.equals(((C1257) obj).f4324);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4324.f11452.hashCode();
    }

    public final String toString() {
        return this.f4324.f11452.toString();
    }
}
