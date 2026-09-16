package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥؙُؑٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0704 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0704 f2552 = new C0704(0, 2, 1);

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        int i = ((C0888) c4902.m8252(0)).f3230;
        List list = (List) c4902.m8252(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            interfaceC4790.mo2818(i3, obj);
            interfaceC4790.mo2819(i3, obj);
        }
    }
}
