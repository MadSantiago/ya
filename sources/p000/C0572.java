package p000;

import java.util.Locale;

/* JADX INFO: renamed from: ۥٜؖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C0572 extends EnumC3840 {
    public C0572() {
        super("RcdataLessthanSign", 10);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        if (c3884.m6963('/')) {
            c4271.m7564();
            c4271.m7568(EnumC3840.f12803);
            return;
        }
        if (c3884.m6970() && c4271.f14153 != null) {
            String str = "</" + c4271.f14153;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (c3884.m6969(lowerCase) <= -1 && c3884.m6969(upperCase) <= -1) {
                AbstractC4435 abstractC4435M7569 = c4271.m7569(false);
                String str2 = c4271.f14153;
                abstractC4435M7569.f14618 = str2;
                abstractC4435M7569.f14615 = str2 != null ? str2.toLowerCase(locale) : "";
                c4271.f14148 = abstractC4435M7569;
                c4271.m7574();
                c3884.m6957();
                c4271.f14137 = EnumC3840.f12856;
                return;
            }
        }
        c4271.m7567("<");
        c4271.f14137 = EnumC3840.f12797;
    }
}
