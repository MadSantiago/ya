package p000;

import android.content.Context;
import android.os.Parcel;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: ۦٕۢؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5536 implements InterfaceC1170 {

    /* JADX INFO: renamed from: ۥْ */
    public static final Object f18277 = new Object();

    /* JADX INFO: renamed from: ۥٓ */
    public static volatile C5147 f18278;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f18279;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18280;

    public C5536(Context context, C1095 c1095) {
        this.f18280 = 0;
        this.f18279 = c1095.m2316() ? AbstractC4385.m7684(context, c1095.m2317()) : c1095.m2317();
    }

    @Override // p000.InterfaceC1170
    public void accept(Object obj, Object obj2) {
        int i = C1543.f5220;
        BinderC0222 binderC0222 = new BinderC0222((C2332) obj2);
        C3663 c3663 = (C3663) ((C5390) obj).m7333();
        Parcel parcelM7504 = c3663.m7504();
        AbstractC5564.m9344(parcelM7504, binderC0222);
        parcelM7504.writeString(this.f18279);
        parcelM7504.writeString("");
        parcelM7504.writeString(null);
        c3663.m7505(parcelM7504, 11);
    }

    public String toString() {
        switch (this.f18280) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return AbstractC5078.m8678(new StringBuilder("<"), this.f18279, '>');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m9212(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f18279);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public /* synthetic */ C5536(int i, String str) {
        this.f18280 = i;
        this.f18279 = str;
    }
}
