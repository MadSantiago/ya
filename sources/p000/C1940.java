package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥْٞؓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1940 extends C4036 {

    /* JADX INFO: renamed from: ۥْ */
    public static final C2432 f6401 = new C2432(new C0062(9));

    @Override // p000.C4036
    /* JADX INFO: renamed from: ۦٛ */
    public final List mo3804(Class cls) {
        int i = AbstractC5551.f18327;
        List listMo3804 = super.mo3804(cls);
        if (AbstractC5551.f18327 < 28) {
            return listMo3804;
        }
        List listM9488 = AbstractC5657.m9488(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM9488) {
            if (obj instanceof Method) {
                arrayList.add(obj);
            }
        }
        return AbstractC0973.m2039(arrayList);
    }
}
