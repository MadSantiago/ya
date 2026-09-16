package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦۧؕۦؘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5828 extends AbstractC5224 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4362 f19198;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3131 f19199;

    public C5828(C3131 c3131, InterfaceC4734 interfaceC4734) {
        super(interfaceC4734);
        this.f19199 = c3131;
        this.f19198 = new C4362(interfaceC4734.mo193(), 0);
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return this.f19198;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo194() {
        return new ArrayList();
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥّ */
    public final int mo195(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo198(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f19199.f10543, arrayList.size()));
    }

    @Override // p000.AbstractC5224
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo199(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        throw null;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۙ */
    public final Iterator mo200(Object obj) {
        return new C0084(1, (Object[]) obj);
    }
}
