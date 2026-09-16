package p000;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: ۦۚؔٓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5174 extends AbstractC4489 {

    /* JADX INFO: renamed from: ۥؔ */
    public final int f17121;

    /* JADX INFO: renamed from: ۦُ */
    public final /* synthetic */ int f17122;

    /* JADX INFO: renamed from: ۦٖ */
    public final Method f17123;

    /* JADX INFO: renamed from: ۦۜ */
    public final boolean f17124;

    public /* synthetic */ C5174(Method method, int i, boolean z, int i2) {
        this.f17122 = i2;
        this.f17123 = method;
        this.f17121 = i;
        this.f17124 = z;
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo963(C1781 c1781, Object obj) {
        int i = this.f17122;
        boolean z = this.f17124;
        Method method = this.f17123;
        int i2 = this.f17121;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC4554.m7926(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC4554.m7926(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC4554.m7926(method, i2, AbstractC3761.m6629("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw AbstractC4554.m7926(method, i2, "Field map value '" + value + "' converted to null by " + C5063.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    c1781.m3567(str, string, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw AbstractC4554.m7926(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw AbstractC4554.m7926(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw AbstractC4554.m7926(method, i2, AbstractC3761.m6629("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    c1781.m3566(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw AbstractC4554.m7926(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw AbstractC4554.m7926(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw AbstractC4554.m7926(method, i2, AbstractC3761.m6629("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw AbstractC4554.m7926(method, i2, "Query map value '" + value3 + "' converted to null by " + C5063.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    c1781.m3568(str3, string2, z);
                }
                return;
        }
    }
}
