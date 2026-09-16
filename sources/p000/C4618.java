package p000;

import android.content.res.Resources;
import android.widget.ImageView;
import androidx.work.Worker;
import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;
import ru.bluecat.yandexmapspatcher.p003ui.workers.UpdateJob;

/* JADX INFO: renamed from: ۦٕٛؔؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4618 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15241;

    public /* synthetic */ C4618(int i, C1282 c1282) {
        this.f15241 = 12;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        Object c4535;
        int i = this.f15241;
        int i2 = 2;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((C3751) obj).m6595();
                return c2358;
            case 1:
                C0637 c0637 = (C0637) obj;
                C4618 c4618 = new C4618(i2);
                c0637.getClass();
                C0637 c0638 = new C0637();
                c4618.mo211(c0638);
                C0672 c0672 = c0637.f2379;
                if (c0672 == null) {
                    c0672 = new C0672();
                }
                c0637.f2379 = c0672;
                c0672.m1503(c0638);
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0637 c0639 = (C0637) obj;
                String string = new C4441(new long[]{-1832159557220539763L, 7599051608665421950L}).toString();
                c0639.getClass();
                C0637.m1442(c0639, string);
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C1917 c1917 = (C1917) obj;
                C1917.m3751(c1917, "JsonPrimitive", new C1878(new C0871(5)));
                C1917.m3751(c1917, "JsonNull", new C1878(new C0871(6)));
                C1917.m3751(c1917, "JsonLiteral", new C1878(new C0871(7)));
                C1917.m3751(c1917, "JsonObject", new C1878(new C0871(8)));
                C1917.m3751(c1917, "JsonArray", new C1878(new C0871(9)));
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                AbstractC0695 abstractC0695 = (AbstractC0695) entry.getValue();
                StringBuilder sb = new StringBuilder();
                AbstractC0696.m1548(str, sb);
                sb.append(':');
                sb.append(abstractC0695);
                return sb.toString();
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C0287 c0287 = (C0287) obj;
                c0287.m609(new C2301(new C0114(AbstractC5041.m8557(C2197.class), null, new C5726(12), 1)));
                c0287.m609(new C2301(new C0114(AbstractC5041.m8557(C3998.class), null, new C5726(13), 1)));
                c0287.m609(new C4141(new C0114(AbstractC5041.m8557(C5269.class), null, new C5726(14), 2)));
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C0287 c0288 = (C0287) obj;
                c0288.m609(new C4141(new C0114(AbstractC5041.m8557(C5648.class), null, new C5726(15), 2)));
                c0288.m609(new C2301(new C0114(AbstractC5041.m8557(C2314.class), null, new C5726(16), 1)));
                c0288.m609(new C4141(new C0114(AbstractC5041.m8557(C2247.class), null, new C5726(17), 2)));
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C0287 c0289 = (C0287) obj;
                c0289.m609(new C2301(new C0114(AbstractC5041.m8557(C1880.class), null, new C5726(19), 1)));
                c0289.m609(new C4141(new C0114(AbstractC5041.m8557(C5081.class), null, new C5726(20), 2)));
                C5726 c5726 = new C5726(21);
                C4093 c4093 = new C4093(AbstractC5041.m8557(UpdateJob.class));
                C0114 c0114 = new C0114(AbstractC5041.m8557(UpdateJob.class), c4093, c5726, 2);
                C4141 c4141 = new C4141(c0114);
                c0289.m609(c4141);
                C3131 c3131M8557 = AbstractC5041.m8557(Worker.class);
                c0114.f455.add(c3131M8557);
                c0289.f1065.put(AbstractC2919.m5505(c3131M8557) + ':' + c4093.f13661 + ':' + C1489.f5055, c4141);
                return c2358;
            case 8:
                ((C3751) obj).m6595();
                return c2358;
            case 9:
                ((Integer) obj).getClass();
                return null;
            case 10:
                return c2358;
            case 11:
                List list = (List) obj;
                return new C0846(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 12:
                return c2358;
            case 13:
                return c2358;
            case 14:
                return c2358;
            case 15:
                return c2358;
            case 16:
                return c2358;
            case 17:
                ((Long) obj).getClass();
                return c2358;
            case 18:
                ((C5275) obj).f17388 = 120;
                return c2358;
            case 19:
                return ((C4571) obj).mo3892();
            case 20:
                return new C4571((Member) obj);
            case 21:
                return Boolean.TRUE;
            case 22:
                AbstractC3992.m7136((InterfaceC1066) obj);
                return c2358;
            case 23:
                InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
                ((InterfaceC1066) obj).mo2266(AbstractC2771.f9207, c2358);
                return c2358;
            case 24:
                C0954 c0954 = (C0954) obj;
                c0954.getClass();
                try {
                    c4535 = c0954.m1971()[0];
                    if (c4535 == null) {
                        c4535 = null;
                    }
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                ImageView imageView = (ImageView) (c4535 instanceof C4535 ? null : c4535);
                if (imageView != null) {
                    try {
                        if (C4966.f16431.contains(imageView.getResources().getResourceEntryName(imageView.getId()))) {
                            imageView.setOnLongClickListener(new ViewOnLongClickListenerC4595());
                            break;
                        }
                    } catch (Resources.NotFoundException unused) {
                    }
                }
                return c2358;
            case 25:
                C0158 c0158 = (C0158) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(c0158.f600);
                sb2.append(", ");
                return AbstractC3761.m6638(sb2, c0158.f597, ')');
            case 26:
                ((C3751) obj).m6595();
                return c2358;
            case 27:
                throw null;
            case 28:
                C5285 c5285 = ((C3766) obj).f12525;
                if (c5285 != null) {
                    c5285.mo449();
                }
                return c2358;
            default:
                ((Long) obj).getClass();
                return c2358;
        }
    }

    public /* synthetic */ C4618(int i) {
        this.f15241 = i;
    }

    public /* synthetic */ C4618(AbstractC0210 abstractC0210) {
        this.f15241 = 27;
    }
}
