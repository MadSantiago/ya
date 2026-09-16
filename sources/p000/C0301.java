package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۥؓؒٔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0301 implements InterfaceC1896 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ AbstractActivityC1500 f1090;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f1091;

    public /* synthetic */ C0301(AbstractActivityC1500 abstractActivityC1500, int i) {
        this.f1091 = i;
        this.f1090 = abstractActivityC1500;
    }

    @Override // p000.InterfaceC1896
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo632() {
        int i = this.f1091;
        AbstractActivityC1500 abstractActivityC1500 = this.f1090;
        switch (i) {
            case 0:
                Bundle bundleM4415 = ((C2346) abstractActivityC1500.f5091.f7785).m4415("android:support:activity-result");
                if (bundleM4415 != null) {
                    C0331 c0331 = abstractActivityC1500.f5102;
                    LinkedHashMap linkedHashMap = c0331.f1236;
                    LinkedHashMap linkedHashMap2 = c0331.f1237;
                    Bundle bundle = c0331.f1239;
                    ArrayList<Integer> integerArrayList = bundleM4415.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM4415.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleM4415.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            c0331.f1238.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleM4415.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    AbstractC3801.m6785(linkedHashMap2).remove(num);
                                }
                            }
                            int iIntValue = integerArrayList.get(i2).intValue();
                            String str2 = stringArrayList.get(i2);
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
                            c0331.f1236.put(str2, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                C0827 c0827 = (C0827) ((AbstractActivityC2747) abstractActivityC1500).f9089.f14025;
                c0827.f2925.m5283(c0827, c0827, null);
                break;
        }
    }
}
