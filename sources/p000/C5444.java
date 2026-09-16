package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦۡؑۜؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5444 implements InterfaceC2895 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f17958;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f17959;

    public /* synthetic */ C5444(int i, Object obj) {
        this.f17959 = i;
        this.f17958 = obj;
    }

    @Override // p000.InterfaceC2895
    /* JADX INFO: renamed from: ۥۣ */
    public final Bundle mo5438() {
        C3869[] c3869Arr;
        int i = this.f17959;
        Object obj = this.f17958;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                C0331 c0331 = ((AbstractActivityC1500) obj).f5102;
                c0331.getClass();
                LinkedHashMap linkedHashMap = c0331.f1236;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0331.f1238));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0331.f1239));
                return bundle;
            case 1:
                Map mapMo1715 = ((C5762) obj).mo1715();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapMo1715.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractActivityC2747 abstractActivityC2747 = (AbstractActivityC2747) obj;
                while (AbstractActivityC2747.m5098(((C0827) abstractActivityC2747.f9089.f14025).f2925)) {
                }
                abstractActivityC2747.f9088.m7369(EnumC1924.ON_STOP);
                return new Bundle();
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C2790) obj).m5269();
            default:
                C1414 c1414 = (C1414) obj;
                for (Map.Entry entry2 : AbstractC4554.m7938((LinkedHashMap) c1414.f4867).entrySet()) {
                    c1414.m2986(((C4994) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : AbstractC4554.m7938((LinkedHashMap) c1414.f4868).entrySet()) {
                    c1414.m2986(((InterfaceC2895) entry3.getValue()).mo5438(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1414.f4871;
                if (linkedHashMap2.isEmpty()) {
                    c3869Arr = new C3869[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new C3869((String) entry4.getKey(), entry4.getValue()));
                    }
                    c3869Arr = (C3869[]) arrayList.toArray(new C3869[0]);
                }
                return AbstractC4554.m7904((C3869[]) Arrays.copyOf(c3869Arr, c3869Arr.length));
        }
    }
}
