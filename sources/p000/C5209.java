package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۦۛؑٓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5209 extends AbstractC0026 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4398 f17215;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4734 f17216;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734 f17217;

    public C5209(InterfaceC4734 interfaceC4734, InterfaceC4734 interfaceC4735) {
        this.f17217 = interfaceC4734;
        this.f17216 = interfaceC4735;
        this.f17215 = new C4398(interfaceC4734.mo193(), interfaceC4735.mo193());
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return this.f17215;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo194() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥّ */
    public final int mo195(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        throw null;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        ((Map) obj).size();
        C4398 c4398 = this.f17215;
        C3782 c3782M6691 = c3782.m6691(c4398);
        Iterator itMo200 = mo200(obj);
        int i = 0;
        while (itMo200.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo200.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            c3782M6691.m6699(c4398, i, this.f17217, key);
            i += 2;
            c3782M6691.m6699(c4398, i2, this.f17216, value);
        }
        c3782M6691.m6683();
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo198(Object obj) {
        return (LinkedHashMap) obj;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        Map map = (Map) obj;
        InterfaceC4734 interfaceC4734 = this.f17217;
        C4398 c4398 = this.f17215;
        Object objMo5162 = interfaceC5308.mo5162(c4398, i, interfaceC4734, null);
        int iMo6291 = interfaceC5308.mo6291(c4398);
        if (iMo6291 != i + 1) {
            C1078.m2273(AbstractC5078.m8679("Value must follow key in a map, index for key: ", i, iMo6291, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objMo5162);
        InterfaceC4734 interfaceC4735 = this.f17216;
        map.put(objMo5162, (!zContainsKey || (interfaceC4735.mo193().mo183() instanceof C2204)) ? interfaceC5308.mo5162(c4398, iMo6291, interfaceC4735, null) : interfaceC5308.mo5162(c4398, iMo6291, interfaceC4735, AbstractC4554.m7912(objMo5162, map)));
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        throw null;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۙ */
    public final Iterator mo200(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }
}
