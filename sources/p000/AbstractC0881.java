package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: ۥٌؙؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0881 {
    /* JADX INFO: renamed from: ۥؗ */
    public static void m1874(C1489 c1489, AbstractC3831 abstractC3831, C0446 c0446) {
        ArrayList arrayList = c0446.f1634;
        for (C0446 c0447 : arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList)) {
            if (c0447.m7287()) {
                AbstractC0881 abstractC0881Mo4833 = abstractC3831.mo4833((String) c0447.f13680);
                if (abstractC0881Mo4833 != null) {
                    abstractC0881Mo4833.mo1876(c1489, abstractC3831, c0447);
                } else {
                    m1874(c1489, abstractC3831, c0447);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public abstract Collection mo1875();

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo1876(C1489 c1489, AbstractC3831 abstractC3831, AbstractC0072 abstractC0072);
}
