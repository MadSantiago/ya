package p000;

import android.text.Layout;

/* JADX INFO: renamed from: ۦؗؑٙٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3400 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final Layout.Alignment f11317;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Layout.Alignment f11318;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC3831.m6874(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC3831.m6874(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f11318 = alignment;
        f11317 = alignment2;
    }
}
