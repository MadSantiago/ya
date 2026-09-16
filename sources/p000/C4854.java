package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: renamed from: ۦُٟؔٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4854 extends C4992 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f15973;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4854(int i) {
        super(24);
        this.f15973 = i;
    }

    @Override // p000.C4992
    /* JADX INFO: renamed from: ۥَ */
    public final boolean mo8217(Method method) {
        switch (this.f15973) {
            case 0:
                break;
        }
        return method.isDefault();
    }

    @Override // p000.C4992
    /* JADX INFO: renamed from: ۥٓ */
    public final Object mo8218(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f15973) {
            case 0:
                break;
        }
        return C5063.m8608(method, cls, obj, objArr);
    }

    @Override // p000.C4992
    /* JADX INFO: renamed from: ۦٌ */
    public String mo8219(Method method, int i) {
        switch (this.f15973) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    return super.mo8219(method, i);
                }
                return "parameter '" + parameter.getName() + '\'';
            default:
                return super.mo8219(method, i);
        }
    }
}
