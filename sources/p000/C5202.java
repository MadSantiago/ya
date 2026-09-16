package p000;

import java.util.AbstractList;

/* JADX INFO: renamed from: ۦۚؗٚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5202 extends AbstractList {

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC3704 f17197;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3627 f17198;

    public C5202(InterfaceC3627 interfaceC3627, InterfaceC3704 interfaceC3704) {
        this.f17198 = interfaceC3627;
        this.f17197 = interfaceC3704;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iM4968 = ((C2667) this.f17198).m4968(i);
        ((C3485) this.f17197).getClass();
        EnumC0885 enumC0885M1879 = EnumC0885.m1879(iM4968);
        return enumC0885M1879 == null ? EnumC0885.f3228 : enumC0885M1879;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((C2667) this.f17198).f8833;
    }
}
