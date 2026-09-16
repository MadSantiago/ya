package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: ۥٝؒۙؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1865 extends AbstractC3072 {

    /* JADX INFO: renamed from: ۥَ */
    public final Field f6208;

    public C1865(Field field) {
        this.f6208 = field;
    }

    @Override // p000.AbstractC1605
    /* JADX INFO: renamed from: ۥْ */
    public final Member mo2502() {
        return this.f6208;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final Object m3715() throws IllegalAccessException {
        m3377();
        Object obj = this.f6208.get(this.f10320);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // p000.AbstractC3072
    /* JADX INFO: renamed from: ۦۧ */
    public final AbstractC3072 mo3716(Object obj) {
        m5666(obj);
        return this;
    }
}
