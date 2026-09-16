package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۥؔؗٛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0421 implements Callable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f1522;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Context f1523;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f1524;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ String f1525;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1526;

    public /* synthetic */ CallableC0421(String str, Context context, Object obj, int i, int i2) {
        this.f1526 = i2;
        this.f1525 = str;
        this.f1523 = context;
        this.f1522 = obj;
        this.f1524 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f1526;
        int i2 = this.f1524;
        Object obj = this.f1522;
        Context context = this.f1523;
        String str = this.f1525;
        switch (i) {
            case 0:
                Object[] objArr = {(C0223) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC5610.m9459(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return AbstractC5610.m9459(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new C2413(-3);
                }
        }
    }
}
