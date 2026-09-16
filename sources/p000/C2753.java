package p000;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: ۥۥٌؖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2753 extends AbstractC0243 {

    /* JADX INFO: renamed from: ۥْ */
    public long f9109;

    /* JADX INFO: renamed from: ۥٓ */
    public String f9110;

    @Override // p000.AbstractC0243
    /* JADX INFO: renamed from: ۥٓ */
    public final boolean mo504() {
        Calendar calendar = Calendar.getInstance();
        this.f9109 = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f9110 = AbstractC3761.m6622(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final long m5110() {
        m503();
        return this.f9109;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final String m5111() {
        m503();
        return this.f9110;
    }
}
