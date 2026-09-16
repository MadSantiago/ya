package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: renamed from: ۥًٕٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0871 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3197;

    public /* synthetic */ C0871(int i) {
        this.f3197 = i;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f3197;
        C2358 c2358 = C2358.f7817;
        int i2 = 0;
        switch (i) {
            case 0:
                C4216 c4216 = AbstractC5022.f16619;
                return C3546.f11778;
            case 1:
                return null;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C4497(48.0f);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return C3519.f11654;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return C4317.f14276;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return C2996.f10072;
            case 8:
                return C1382.f4732;
            case 9:
                return C3252.f10921;
            case 10:
                throw new IllegalStateException("should not be used in favor of LocalKoinScopeContext");
            case 11:
                throw new IllegalStateException("should not be used in favor of getKoin()");
            case 12:
                C1414 c1414 = C1397.f4778;
                if (c1414 != null) {
                    return new C0657((C2354) ((C1489) c1414.f4869).f5056, new C0871(14));
                }
                C1078.m2276("KoinApplication has not been started");
                return null;
            case 13:
                C1414 c1415 = C1397.f4778;
                if (c1415 != null) {
                    return new C0657(c1415, new C0871(15));
                }
                C1078.m2276("KoinApplication has not been started");
                return null;
            case 14:
                C1414 c1416 = C1397.f4778;
                if (c1416 != null) {
                    return (C2354) ((C1489) c1416.f4869).f5056;
                }
                C1078.m2276("KoinApplication has not been started");
                return null;
            case 15:
                C1414 c1417 = C1397.f4778;
                if (c1417 != null) {
                    return c1417;
                }
                C1078.m2276("KoinApplication has not been started");
                return null;
            case 16:
                return new C0846(0, 0);
            case 17:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 18:
                C4216 c4217 = AbstractC1761.f5866;
                return C1298.f4455;
            case 19:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 20:
                return null;
            case 21:
                return C0842.f3008;
            case 22:
                PackageInfo packageInfoM1036 = AbstractC0487.m1036(new C4441(new long[]{-1128933215611033899L, 3800614465700064880L, 6334205006586548618L, -7618293441889890797L}).toString());
                if (packageInfoM1036 == null) {
                    return null;
                }
                ApplicationInfo applicationInfo = packageInfoM1036.applicationInfo;
                return (applicationInfo != null ? applicationInfo.dataDir : null) + "/files/ym_mmkv";
            case 23:
                return UUID.randomUUID();
            case 24:
                PackageInfo packageInfoM1037 = AbstractC0487.m1036(new C4441(new long[]{6375205792684117863L, 3392591840014425452L, -8586423014999026835L, -1461673406762486212L}).toString());
                if (packageInfoM1037 == null) {
                    return null;
                }
                ApplicationInfo applicationInfo2 = packageInfoM1037.applicationInfo;
                return (applicationInfo2 != null ? applicationInfo2.dataDir : null) + "/files/notificationsconfigcacheid.bin";
            case 25:
                C3626 c3626 = C3626.f12101;
                InterfaceC0103[] interfaceC0103Arr = new InterfaceC0103[0];
                if (AbstractC0684.m1534("kotlin.Unit")) {
                    C1078.m2272("Blank serial names are prohibited");
                    return null;
                }
                if ((c3626 == C3626.f12098 ? 1 : 0) == 0) {
                    C1917 c1917 = new C1917("kotlin.Unit");
                    return new C2148("kotlin.Unit", c3626, c1917.f6316.size(), AbstractC0246.m509(interfaceC0103Arr), c1917);
                }
                C1078.m2272("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                return null;
            case 26:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String[] strArr = AbstractC5069.f16820;
                int i3 = 0;
                while (i2 < 256) {
                    linkedHashMap.put(strArr[i2], Integer.valueOf(i3));
                    i2++;
                    i3++;
                }
                return linkedHashMap;
            case 27:
                return new C0593();
            case 28:
                C0649 c0649 = AbstractC0912.f3276;
                return ExecutorC4540.f15006;
            default:
                return new C4109(C5748.f18960, 0);
        }
    }

    public /* synthetic */ C0871(int i, Object obj) {
        this.f3197 = i;
    }
}
