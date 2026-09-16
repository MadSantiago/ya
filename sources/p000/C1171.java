package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥّؕۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1171 implements InterfaceC3275 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f4057;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ List f4058;

    public C1171(int i, List list) {
        this.f4058 = list;
        this.f4057 = i;
    }

    @Override // p000.InterfaceC3275
    /* JADX INFO: renamed from: ۦ۟ */
    public final Object mo1822(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C4068 c4068 = (C4068) obj;
        int iIntValue = ((Number) obj2).intValue();
        C5362 c5362 = (C5362) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        new C4441(new long[]{1732865667555603246L, -2852145964484543001L, 3892638051297881257L, 3413891811608638974L, 359144498529814878L, 3684337708708382708L}).toString();
        int i2 = 2;
        if ((iIntValue2 & 6) == 0) {
            i = (c5362.m8963(c4068) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= c5362.m8988(iIntValue) ? 32 : 16;
        }
        if (c5362.m9011(i & 1, (i & 147) != 146)) {
            C3869 c3869 = (C3869) this.f4058.get(iIntValue);
            c5362.m8957(289138623);
            new C4441(new long[]{-2994183161876758184L, -7530817326486257300L, -9024891038254577927L, 7404244151882074579L, 4524680479896588716L, 2554311259883270142L, 8281445520382296261L, 6029339820219332557L, 3915596868988007679L, 1786876295426127703L, -7199286652774438604L, 3123304167997680402L, -6112690101938354758L, 312282498101061573L}).toString();
            C0971 c0971 = C0971.f3428;
            String str = (String) c3869.f12914;
            c0971.getClass();
            C1185 c1185 = (C1185) c0971.m2035(C1185.Companion.serializer(), str);
            AbstractC0993.m2159(AbstractC3925.m7034(1833188184, new C4190(i2, c3869), c5362), null, AbstractC3925.m7034(1811047221, new C3589(c1185, (c1185.f4073 ? new C4441(new long[]{-7835435128175864910L, -4693985328292322193L}) : new C4441(new long[]{-5920715194601679448L, -4802757427060015957L})).toString(), (c1185.f4072 ? new C4441(new long[]{-5197548880790712490L, -1668550020914728930L}) : new C4441(new long[]{-7968229767001949104L, -9017824719074334932L})).toString()), c5362), AbstractC2133.m4154(AbstractC2873.m5440((C2917) c5362.m8997(AbstractC0118.f470)), c5362), c5362, 3078, 438);
            if (this.f4057 != iIntValue + 1) {
                c5362.m8957(-267735031);
                new C4441(new long[]{3911872405338418178L, -3802380258752759015L, 1119297870434229745L}).toString();
                AbstractC4009.m7154(null, 0.0f, 0L, c5362, 0, 7);
            } else {
                c5362.m8957(290166892);
            }
            c5362.m9009(false);
            c5362.m9009(false);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
