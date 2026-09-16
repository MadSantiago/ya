package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٌّؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3998 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C3161 f13334;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4994 f13335;

    public C3998() {
        C4994 c4994M3349 = AbstractC1605.m3349(new C0783(R.string.dialog_exception_title, R.string.dialog_exception_message, new C4441(new long[]{2933049748134389650L}).toString(), false));
        this.f13335 = c4994M3349;
        this.f13334 = new C3161(c4994M3349, null);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m7138(C3998 c3998, int i, String str, int i2) {
        Object value;
        int i3 = (i2 & 1) != 0 ? R.string.dialog_exception_title : R.string.dialog_shizuku_adb_title;
        if ((i2 & 2) != 0) {
            i = R.string.dialog_exception_message;
        }
        if ((i2 & 4) != 0) {
            str = new C4441(new long[]{7224687356951477335L}).toString();
        }
        C4994 c4994 = c3998.f13335;
        do {
            value = c4994.getValue();
            ((C0783) value).getClass();
        } while (!c4994.m8386(value, new C0783(i3, i, str, true)));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7139() {
        C4994 c4994;
        Object value;
        int i;
        int i2;
        String str;
        do {
            c4994 = this.f13335;
            value = c4994.getValue();
            C0783 c0783 = (C0783) value;
            i = c0783.f2828;
            i2 = c0783.f2827;
            str = c0783.f2826;
            c0783.getClass();
        } while (!c4994.m8386(value, new C0783(i, i2, str, false)));
    }
}
