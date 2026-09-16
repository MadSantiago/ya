package p000;

/* JADX INFO: renamed from: ۦؘؚؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3064 extends AbstractC2395 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f10302;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f10303;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4745 f10304;

    public C3064(Object obj, String str, int i, InterfaceC4745 interfaceC4745) {
        super(obj);
        this.f10303 = str;
        this.f10302 = i;
        this.f10304 = interfaceC4745;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f7967);
        sb.append(", label=\"");
        sb.append(this.f10303);
        sb.append("\", leadingIcon=");
        return AbstractC3761.m6638(sb, this.f10302, ')');
    }
}
